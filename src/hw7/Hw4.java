package hw7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;

public class Hw4 {

	public static void main(String[] args) throws IOException {

		File file = new File("data\\Object.ser");

		ArrayList arr = new ArrayList();

		Cat c1 = new Cat("Kitty");
		Cat c2 = new Cat("Daisy");
		Dog d1 = new Dog("Puppy");
		Dog d2 = new Dog("Max");
		arr.add(c1);
		arr.add(c2);
		arr.add(d1);
		arr.add(d2);

		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		for (Object i : arr) {
			oos.writeObject(i);
		}

		oos.close();
		fos.close();

	}

}
