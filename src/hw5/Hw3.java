package hw5;

public class Hw3 {

	public static void main(String[] args) {

		Work03 w = new Work03();

		int[][] intArray = { { 1, 6, 3 }, { 9, 5, 2 } };
		double[][] doubleArray = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };
		
		System.out.println(w.maxElement(intArray));
		System.out.println(w.maxElement(doubleArray));

	}

}

class Work03 {

	int maxElement(int[][] arr) {

		int maxValue = arr[0][0];

		for (int[] a : arr) {
			for (int value : a) {
				if (value > maxValue) {
					maxValue = value;
				}
			}
		}
		return maxValue;
	}

	double maxElement(double[][] arr) {

		double maxValue = arr[0][0];

		for (double[] a : arr) {
			for (double value : a) {
				if (value > maxValue) {
					maxValue = value;
				}
			}
		}
		return maxValue;
	}
}