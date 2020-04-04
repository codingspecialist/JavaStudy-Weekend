package ioex;

import java.io.IOException;
import java.io.InputStreamReader;

public class IoEx02 {

	public static void main(String[] args) {
		InputStreamReader reader = new InputStreamReader(System.in);
		
		try {
			char[] inData = new char[1000];
			reader.read(inData);
			System.out.println(inData);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
