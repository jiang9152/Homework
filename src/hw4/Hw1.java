package hw4;

public class Hw1 {

	public static void main(String[] args) {

		int[] arr = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int sum = 0;

		for (int a : arr) {
			sum += a;
		}

		double avg = sum / arr.length;

		System.out.println("平均數 : " + avg);

		System.out.println("大於平均的元素 :");

		for (int a : arr) {
			if (a > avg) {
				System.out.print(a + "\t");
			}
		}
	}

}
