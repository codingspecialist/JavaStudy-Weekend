package ioex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IoEx03 {

	public static void main(String[] args) {
		

		InputStream in = System.in; // ����Ʈ ��� = Ű����
		InputStreamReader r = new InputStreamReader(in); // ���� ���
		BufferedReader br = new BufferedReader(r); // ������� + ����
		
		BufferedReader bbr = 
				new BufferedReader(new InputStreamReader(System.in));

		String data;
		try {
			while((data = bbr.readLine()) != null) {
				System.out.println(data);
			}
		} catch (IOException e) {
			System.out.println("����ϴٰ� ���� �����ϴ�.");
		}
		
	}

}
