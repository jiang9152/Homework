package hw4;

import java.util.Arrays;

public class Hw6 {

	public static void main(String[] args) {

		int[][] test = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };

		int[] student = new int[8];

		for (int[] t : test) {

			int maxScore = t[0];
			int maxStudent = 0;

			for (int i = 1; i < t.length; i++) {
				if (t[i] > maxScore) {
					maxScore = t[i];
					maxStudent = i;
				}
			}

			student[maxStudent]++;
		}
		System.out.println("每位同學考最高分的次數分別如下:");
		System.out.println(Arrays.toString(student));
	}

}
