package hw10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Hw3 {

	public static void main(String[] args) throws ParseException {

		final String REGEX = "^\\d{8}$";

		Scanner scr = new Scanner(System.in);

		System.out.print("請輸入日期(年月日，例如:20110131): ");
		String input = scr.next();

		while (!input.matches(REGEX)) {
			System.out.println("日期格式不正確，請再輸入一次! ");
			System.out.print("請輸入日期(年月日，例如:20110131): ");
			input = scr.next();
		}

		Date date = new SimpleDateFormat("yyyyMMdd").parse(input);

		System.out.print("欲格式化成(1)年/月/日(2)月/日/年(3)日/月/年: ");
		String print_type = scr.next();

		switch (print_type) {
		case "1":
			SimpleDateFormat s1 = new SimpleDateFormat("yyyy/MM/dd");
			System.out.println(s1.format(date));
			break;
		case "2":
			SimpleDateFormat s2 = new SimpleDateFormat("MM/dd/yyyy");
			System.out.println(s2.format(date));
			break;
		case "3":
			SimpleDateFormat s3 = new SimpleDateFormat("dd/MM/yyyy");
			System.out.println(s3.format(date));
			break;
		}

	}

}
