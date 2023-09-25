package hw7;

import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Hw3 {

	public static void main(String[] args) throws IOException {

		copyFile(new File("data\\input.txt"), new File("data\\output.txt"));
	}

	public static void copyFile(File input, File output) throws IOException {

		FileReader fr = new FileReader(input);
		BufferedReader br = new BufferedReader(fr);

		String str;
		ArrayList<String> arr = new ArrayList<>();

		while ((str = br.readLine()) != null)
			arr.add(str);

		br.close();
		fr.close();

		
		FileWriter fw = new FileWriter(output);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);

		for (String a : arr) {
			pw.println(a);
			pw.flush();
		}

		pw.close();
		bw.close();
		fw.close();

	}

}
