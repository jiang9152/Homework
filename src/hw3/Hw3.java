package hw3;

import java.util.*;

public class Hw3 {

	public static void main(String[] args) {

		Scanner sr = new Scanner(System.in);

		System.out.println("請輸入不要的數字(1~9):");

		int num = sr.nextInt();

		sr.close();

		int[] lottery = getRandom(deleteNum(num));

		int sum = 0, i = 0;

		System.out.println("建議數字(6個):");

		while (sum < 6) {
			if (lottery[i] != -1) {
				System.out.print(lottery[i] + " ");
				sum++;
			}
			i++;

		}
	}

	static int[] deleteNum(int x) {

		int[] arr = new int[49];

		for (int i = 0; i < arr.length; i++) {
			if ((i + 1) % 10 == x) {
				arr[i] = -1;
			} else if (x * 10 <= (i + 1) && (i + 1) <= (x * 10) + 9) {
				arr[i] = -1;
			} else {
				arr[i] = i + 1;
			}

		}

		return arr;
	}

	static int[] getRandom(int[] a) {

		int x, r;

		for (int i = 0; i < a.length; i++) {

			r = (int) (Math.random() * a.length);

			x = a[i];
			a[i] = a[r];
			a[r] = x;
		}

		return a;
	}
}
