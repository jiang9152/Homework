package hw10;

public class Hw1 {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			int num = (int) (Math.random() * 100 + 1);

			if (isPrime(num)) {
				System.out.println(num + "是質數");
			} else {
				System.out.println(num + "不是質數");
			}
		}
	}

	public static boolean isPrime(int n) {
		if (1 >= n) {
			return false;
		} else {
			for (int i = 2; i <= (int) (Math.sqrt(n)); i++) {
				if (n % i == 0)
					return false;
			}
			return true;
		}
	}

}
