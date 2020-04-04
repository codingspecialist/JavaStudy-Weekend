package ioex;

import java.io.IOException;
import java.io.InputStream;

//��Ʈ���� ����Ʈ(����)�� �帧
//�������� ���� �帧
//A������ -> B������ �̵��ϴ� ���� �帧
//�������� ���� -> ���
//������ �帧 -> ���� -> ���
public class IoEx01 {

	public static void main(String[] args) {
		// ��Ʈ�� (1����Ʈ)
		InputStream in = System.in;

		try {
			int inData = in.read();
			System.out.println((char)inData);
		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.out.println("��Ž� ������ �����.");
		}
	}

}
