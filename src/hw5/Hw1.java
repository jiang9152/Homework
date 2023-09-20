package hw5;

import java.util.*;

public class Hw1 {

	public static void main(String[] args) {

		System.out.println("請輸入寬與高:");

		Scanner scr = new Scanner(System.in);

		int width = scr.nextInt();
		int height = scr.nextInt();

		scr.close();

		starSquare(width, height);

	}

	static void starSquare(int width, int height) {

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}

}
