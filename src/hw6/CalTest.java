package hw6;

import java.util.Scanner;
import java.util.*;

public class CalTest {

	public static void main(String[] args) {

		try {

			Calculator c = new Calculator();

			Scanner src = new Scanner(System.in);

			System.out.println("請輸入x的值:");
			String x1 = src.next();

			if (isNumeric(x1)) {
				System.out.println("請輸入y的值:");
				String y1 = src.next();
				src.close();
				if (isNumeric(y1)) {
					c.powerXY(Integer.parseInt(x1), Integer.parseInt(y1));
				} else {
					System.out.println("輸入格式不正確");
				}
			} else {
				System.out.println("輸入格式不正確");
			}

		} catch (CalException e) {
			System.out.println(e.getMessage());
		}
	}

	public static boolean isNumeric(String str) {
		try {
			Double.parseDouble(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

}
