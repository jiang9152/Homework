package hw3;

import java.util.*;

public class Hw1 {
	public static void main(String args[]) {
		Scanner sr = new Scanner(System.in);

		System.out.println("請輸入三個整數:");

		int[] sides = new int[3];

		for (int s = 0; s < 3; s++) {
			int a = sr.nextInt();
			sides[s] = a;
		}

		Arrays.sort(sides);

		if (isTriangle(sides)) {

			if (sides[0] == sides[1] && sides[1] == sides[2]) {
				System.out.println("正三角形");
			} else if (sides[0] == sides[1] || sides[1] == sides[2]) {
				if(isRight(sides)) 
					System.out.println("等腰直角三角形");
				else
					System.out.println("等腰三角形");
				
			} else {
				if(isRight(sides)) 
					System.out.println("直角三角形");
				else
					System.out.println("其他三角形");
			}
		} else {
			System.out.println("不是三角形");
		}

	}

	static boolean isTriangle(int[] arr) {

		if (arr[0] <= 0 || arr[1] <= 0 || arr[2] <= 0 || arr[0] + arr[1] <= arr[2]) {
			return false;
		} else {
			return true;
		}
	}

	static boolean isRight(int[] arr) {
		
		if ( Math.pow(arr[0], 2) + Math.pow(arr[1], 2) == Math.pow(arr[2], 2)){
			return true;
		} else {
			return false;
		}
	}
}
