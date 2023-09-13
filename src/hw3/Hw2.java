package hw3;

import java.util.*;


public class Hw2 {

	public static void main(String[] args) {

		Scanner sr = new Scanner(System.in);
		
		int answer = (int) (Math.random() * 101);

		System.out.println("請輸入0~100之間的數字");

		int guess = sr.nextInt();
		
		int max = 100, min = 0;
		
		while (guess != answer) {
			if (guess > answer) {
				max = guess;
				System.out.println("請輸入" + min + "~" + guess + "之間的數字");
				guess = sr.nextInt();
			} else {
				min = guess;
				System.out.println("請輸入" + guess + "~" + max + "之間的數字");
				guess = sr.nextInt();
			}
		}
		System.out.println("猜對了");
		
		sr.close();

	}

}
