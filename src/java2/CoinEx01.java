package java2;

public class CoinEx01 {

	int money = 2680;
	int restMoney = money;
	
	void restMoneyPrint(int coin) {
		System.out.println(coin+"원 개수 : "+restMoney/coin);
		restMoney = money % coin;
		System.out.println("남음 금액 : "+restMoney);
	}
	
	public static void main(String[] args) {
		int coinType[] = {500, 100, 50, 10};
		CoinEx01 coinEx01 = new CoinEx01();
		for (int i = 0; i < 4; i++) {
			coinEx01.restMoneyPrint(coinType[i]);
		}

		// 500 * 5, 100 * 1, 50 * 1, 10 * 3
//		System.out.println("500원 개수 : "+restMoney/500);
//		restMoney = money % 500;
//		System.out.println("남음 금액 : "+restMoney);
//		
//		System.out.println("100원 개수 : "+restMoney/100);
//		restMoney = restMoney % 100;
//		System.out.println("남음 금액 : "+restMoney);
//		
//		System.out.println("50원 개수 : "+restMoney/50);
//		restMoney = restMoney % 50;
//		System.out.println("남음 금액 : "+restMoney);
//		
//		System.out.println("10원 개수 : "+restMoney/10);
//		restMoney = restMoney % 10;
//		System.out.println("남음 금액 : "+restMoney);
	}

}
