package hw4;

public class Hw3 {

	public static void main(String[] args) {

		String[] text = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		int vowel = 0;

		for (String t : text) {
			char[] a = t.toCharArray();
			for (int i = 0; i < a.length; i++) {
				if (a[i] == 'a' || a[i] == 'e'|| a[i] == 'i'|| a[i] == 'o'|| a[i] == 'u') {
					vowel ++;
				}

			}
		}
		System.out.println(vowel);
	}

}
