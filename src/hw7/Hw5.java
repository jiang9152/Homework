package hw7;

import java.io.*;

public class Hw5 {

	public static void main(String[] args) throws IOException {

		File myFile = new File("data\\Object.ser");
		FileInputStream fis = new FileInputStream(myFile);
		ObjectInputStream ois = new ObjectInputStream(fis);

		try {
			while (true) {
				((Speakable) ois.readObject()).speak();

				System.out.println("==================");
			}
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("資料讀取完畢！");
		}

		ois.close();
		fis.close();

	}

}
