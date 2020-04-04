package ioex;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class HttpEx01 {
	
	static String requests(String address) {
		String result = "";
		try {
			URL url = new URL(address);
			URLConnection con = url.openConnection(); // con ½ºÆ®¸²
			BufferedReader br = 
					new BufferedReader
			(new InputStreamReader(con.getInputStream(), "UTF-8"));
			
			String data;
			while ((data = br.readLine()) != null) {
				result =  result + data;
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public static void main(String[] args) {
		String result = requests("https://www.naver.com");
		System.out.println(result);
		
	}
}


