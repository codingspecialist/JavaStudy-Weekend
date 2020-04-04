package ioex;

import java.io.IOException;
import java.io.InputStream;

//스트림은 바이트(전류)의 흐름
//수도관은 물의 흐름
//A수도관 -> B수도관 이동하는 물의 흐름
//수도꼭지 오픈 -> 잠금
//전류가 흐름 -> 오픈 -> 잠금
public class IoEx01 {

	public static void main(String[] args) {
		// 스트림 (1바이트)
		InputStream in = System.in;

		try {
			int inData = in.read();
			System.out.println((char)inData);
		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.out.println("통신시 오류가 났어요.");
		}
	}

}
