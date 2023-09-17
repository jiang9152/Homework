package hw4;

import java.util.*;

public class Hw4 {

	public static void main(String[] args) {
        
		System.out.println("請輸入借錢金額:");
		Scanner sr = new Scanner(System.in);

		int money = sr.nextInt();
		int sum = 0;

		sr.close();

		int[][] arr = { { 25, 2500 }, { 32, 800 }, { 8, 500 }, { 19, 1000 }, { 27, 1200 } };

		System.out.println("有錢可借的員工編號:");

		for (int[] a : arr) {
			if (a[1] >= money) {
				System.out.print(a[0] + " ");
				sum++;
			}

		}
		System.out.println("\n共" + sum + "人");

	}

}
