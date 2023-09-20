package hw5;

import java.util.Arrays;

public class Hw2 {

	public static void main(String[] args) {
		
		randAvg();

	}
	
	static void randAvg() {
		
		int sum = 0;
		int[] arr = new int[10]; 
		
		for (int i = 0; i<10; i++ ) {		
			arr[i] = (int)(Math.random()*101);
			sum += arr[i]; 	
		}
		
		System.out.println("本次亂數結果:");
		System.out.println(Arrays.toString(arr));
		System.out.println("平均: " + sum / 10);
		
	}

}
