package hw7;

import java.io.*;

public class Hw1 {

	public static void main(String[] args) throws IOException {

		File myFile = new File("Data\\Sample.txt");
		FileReader fr = new FileReader(myFile);
		BufferedReader br = new BufferedReader(fr);

		String str;
		int lineNum = 0;
		int charNum = 0;

		while ((str = br.readLine()) != null) {

			if (!str.isEmpty()) {
				lineNum += 1;
				str = str.replaceAll("(\\r\\n|\\n|\\r)", "");
				str.trim();
				charNum += str.length();

			}

		}
		System.out.println("Sample.txt檔案共有" + myFile.length() + "個位元組," + charNum + "個字元," + lineNum + "列資料");

		br.close();
		fr.close();

	}

}
