package java3;

public class Example01 {

	// 초를 받음 -> 시, 분, 초 로 변환해서 리턴!!
	static String changeTime(int sec) {
		String result = null;
		int min=0;
		int hour=0;
		int remainSec=0;
		
		// 10000
		min = sec/60; // 10000 / 60 = 166
		hour = min/60; // 166 / 60 = 2
		remainSec = sec % 60; // 10000 % 60 = 40
		min = min % 60; // 166 % 60 = 46
		
		result = hour+"시간"+min+"분"+remainSec+"초";
		return result;
	}
	
	public static void main(String[] args) {
		String time = changeTime(10000);
		System.out.println(time);
	}

}
