package hw10;

import java.text.DecimalFormat;
import java.util.*;

public class Hw2 {

	public static void main(String[] args) {

		final String REGEX = "^[-+]?\\d+.?\\d*$";

		Scanner scr = new Scanner(System.in);

		System.out.print("請輸入數字: ");
		String input = scr.next();

		while (!input.matches(REGEX)) {
			System.out.println("數字格式不正確，請再輸入一次! ");
			System.out.print("請輸入數字: ");
			input = scr.next();
		}

		double input_num = Double.parseDouble(input);
		
		System.out.print("欲格式化成(1)千分位(2)百分比(3)科學記號: ");
		String print_type = scr.next();
		
		switch (print_type) {
		case "1":
			System.out.println(new DecimalFormat(",###").format(input_num));
			break;
		case "2":
			System.out.println(new DecimalFormat("#.##%").format(input_num));
			break;
		case "3":
			System.out.println(new DecimalFormat("0.0000E00").format(input_num));
			break;
		}

	}

}
