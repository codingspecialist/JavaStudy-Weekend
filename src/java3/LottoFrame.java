package java3;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;
import java.util.Random;


public class LottoFrame extends Frame 
implements ActionListener{
	
	Button btn;
	int lotto[] = new int[6];
	
	public LottoFrame() {
		setSize(400, 200);
		setBackground(Color.gray);
		setVisible(true);
		btn = new Button("로또");
		btn.addActionListener(this);
		add(btn,BorderLayout.SOUTH);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new LottoFrame();
	}

	public void paint(Graphics g){
		g.setColor(Color.white);
		Font f = new Font("궁서체",Font.BOLD,25);
		g.setFont(f);
		if(lotto[0]==0){
			g.drawString("로또 버튼을 클릭하세요.", 50, 100);
			return;
		}
		for (int i = 0, x =50; i < lotto.length; i++, x+=50) {
			g.drawString(lotto[i]+"", x , 100);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		lotto = getLotto();
		repaint();
	}

	public int[] getLotto(){
		int[] lotto = new int[6]; // 로또배열을 만들어줌.
		Random r = new Random();
		for (int i = 0; i < 6; i++) { // 배열만큼 반복
			int j = r.nextInt(45) + 1;
			lotto[i] = j; // 배열에 랜덤으로 값을 집어넣음.
			for (int e = 0; e < i; e++) { // 중복값 확인을 위해 e라는 변수를 주어서 i만큼 반복함
				if (lotto[i] == lotto[e]) { // 중복값을 비교함 만약 중복이면
					i = i - 1;
					break;
				}
			}
		}
		Arrays.sort(lotto);
		
		return lotto;
	}
}
