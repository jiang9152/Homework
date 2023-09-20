package hw5;

public class Hw5 {

	public static void main(String[] args) {

		Hw5 h = new Hw5();
		h.genAuthCode();

	}

	void genAuthCode() {

		char[] totalChar = new char[62];

		for (int i = 0; i < totalChar.length; i++) {

			if (i < 10) {
				totalChar[i] = (char) (48 + i);
			} else if (i >= 10 & i < 36) {
				totalChar[i] = (char) (55 + i);
			} else {
				totalChar[i] = (char) (61 + i);
			}
		}

		char[] codeArr = new char[8];

		for (int i = 0; i < codeArr.length; i++) {

			int ran = (int) (Math.random() * 62);

			codeArr[i] = totalChar[ran];
		}

		String ranCode = new String(codeArr);

		System.out.println("本次隨機產生驗證碼為:");
		System.out.println(ranCode);

	}

}
