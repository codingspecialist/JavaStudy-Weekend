package ioex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IoEx03 {

	public static void main(String[] args) {
		

		InputStream in = System.in; // 바이트 통신 = 키보드
		InputStreamReader r = new InputStreamReader(in); // 문자 통신
		BufferedReader br = new BufferedReader(r); // 문자통신 + 버퍼
		
		BufferedReader bbr = 
				new BufferedReader(new InputStreamReader(System.in));

		String data;
		try {
			while((data = bbr.readLine()) != null) {
				System.out.println(data);
			}
		} catch (IOException e) {
			System.out.println("통신하다가 오류 났습니다.");
		}
		
	}

}
