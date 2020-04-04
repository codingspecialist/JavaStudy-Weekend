package ioex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import com.google.gson.Gson;

public class ApiExplorer {
    public static void main(String[] args) throws IOException {
    	
    	// 1. 주소 만들기
    	StringBuilder urlBuilder = new StringBuilder("http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getFlightOpratInfoList"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("ServiceKey","UTF-8") + "=TYJuOuhQd%2BPQB9hRLr96SDnMNeegd0U3g9mOpBpumr6DwZ6sgto5MjcX%2F8rUKaIKC3AHWmO4gTEHK39cCxwLug%3D%3D"); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("10", "UTF-8")); /*한 페이지 결과 수*/
        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지 번호*/
        urlBuilder.append("&" + URLEncoder.encode("depAirportId","UTF-8") + "=" + URLEncoder.encode("NAARKJJ", "UTF-8")); /*출발공항ID*/
        urlBuilder.append("&" + URLEncoder.encode("arrAirportId","UTF-8") + "=" + URLEncoder.encode("NAARKPC", "UTF-8")); /*도착공항ID*/
        urlBuilder.append("&" + URLEncoder.encode("depPlandTime","UTF-8") + "=" + URLEncoder.encode("20200408", "UTF-8")); /*출발일*/
        urlBuilder.append("&" + URLEncoder.encode("airlineId","UTF-8") + "=" + URLEncoder.encode("AAR", "UTF-8")); /*항공사ID*/
        // tip : json으로 받고 싶을 때 사용
        urlBuilder.append("&_type=json");
        //System.out.println(urlBuilder.toString());
        
        // 2. URL 객체 생성 = 인터넷 주소를 담아준다.
        URL url = new URL(urlBuilder.toString());
        
        // 3. 스트림 연결하기
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET"); // 인터넷 주소창에 요청
        conn.setRequestProperty("Content-type", "application/json");
    
        // 4. 버퍼 달기
        BufferedReader rd = null;
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
        } 
        
        // 5. 버퍼 비우기
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();
        conn.disconnect();
        System.out.println(sb.toString());
        
        // 6. 자바 오브젝트 변환 -> gson의 fromJson() 함수 사용
        Gson gson = new Gson();
        AirplaneData airplaneData = 
        		gson.fromJson(sb.toString(), AirplaneData.class);
        
        System.out.println(airplaneData.response.body.items.item.get(0).economyCharge);
        
        for (Item item : airplaneData.response.body.items.item) {
			System.out.println(item.depPlandTime);
		}
    }
}



