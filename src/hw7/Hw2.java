package hw7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class Hw2 {

	public static void main(String[] args) {

		int[] arr = new int[10];

		for (int i = 0; i < 10; i++) {
			arr[i] = (int) (Math.random() * 1000 + 1);

		}

		try {
			FileWriter fw = new FileWriter("data\\Data.txt", true);

			BufferedWriter bw = new BufferedWriter(fw);

			PrintWriter pw = new PrintWriter(bw);

			pw.println(Arrays.toString(arr));

			pw.close();
			bw.close();
			fw.close();

		} catch (IOException e) {
			
			System.err.println(e);
			
		}
	}

}
