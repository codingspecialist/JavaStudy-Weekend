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
    	
    	// 1. �ּ� �����
    	StringBuilder urlBuilder = new StringBuilder("http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getFlightOpratInfoList"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("ServiceKey","UTF-8") + "=TYJuOuhQd%2BPQB9hRLr96SDnMNeegd0U3g9mOpBpumr6DwZ6sgto5MjcX%2F8rUKaIKC3AHWmO4gTEHK39cCxwLug%3D%3D"); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("10", "UTF-8")); /*�� ������ ��� ��*/
        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*������ ��ȣ*/
        urlBuilder.append("&" + URLEncoder.encode("depAirportId","UTF-8") + "=" + URLEncoder.encode("NAARKJJ", "UTF-8")); /*��߰���ID*/
        urlBuilder.append("&" + URLEncoder.encode("arrAirportId","UTF-8") + "=" + URLEncoder.encode("NAARKPC", "UTF-8")); /*��������ID*/
        urlBuilder.append("&" + URLEncoder.encode("depPlandTime","UTF-8") + "=" + URLEncoder.encode("20200408", "UTF-8")); /*�����*/
        urlBuilder.append("&" + URLEncoder.encode("airlineId","UTF-8") + "=" + URLEncoder.encode("AAR", "UTF-8")); /*�װ���ID*/
        // tip : json���� �ް� ���� �� ���
        urlBuilder.append("&_type=json");
        //System.out.println(urlBuilder.toString());
        
        // 2. URL ��ü ���� = ���ͳ� �ּҸ� ����ش�.
        URL url = new URL(urlBuilder.toString());
        
        // 3. ��Ʈ�� �����ϱ�
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET"); // ���ͳ� �ּ�â�� ��û
        conn.setRequestProperty("Content-type", "application/json");
    
        // 4. ���� �ޱ�
        BufferedReader rd = null;
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
        } 
        
        // 5. ���� ����
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();
        conn.disconnect();
        System.out.println(sb.toString());
        
        // 6. �ڹ� ������Ʈ ��ȯ -> gson�� fromJson() �Լ� ���
        Gson gson = new Gson();
        AirplaneData airplaneData = 
        		gson.fromJson(sb.toString(), AirplaneData.class);
        
        System.out.println(airplaneData.response.body.items.item.get(0).economyCharge);
        
        for (Item item : airplaneData.response.body.items.item) {
			System.out.println(item.depPlandTime);
		}
    }
}



