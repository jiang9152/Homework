package hw1;

public class Hw3 {

	public static void main(String[] args) {
		int sec = 256559;
		
		int min = sec / 60;
		sec = 256559 % 60;
		
		int hour = min / 60;
		min %= 60;
		
		int day = hour / 24;
		hour %= 24;
		
		System.out.println("256559秒等於" + day + "天"+ hour + "時" + min + "分" + sec + "秒");

	}

}
