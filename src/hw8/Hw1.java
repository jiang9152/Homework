package hw8;

import java.util.*;
import java.lang.*;
import java.math.BigInteger;

public class Hw1 {

	public static void main(String[] args) {

		ArrayList arr = new ArrayList();
		arr.add(new Integer(100));
		arr.add(new Double(3.14));
		arr.add(new Long(21L));
		arr.add(new Short("100"));
		arr.add(new Double(5.1));
		arr.add("Kitty");
		arr.add(new Integer(100));
		arr.add(new Object());
		arr.add("Snoopy");
		arr.add(new BigInteger("1000"));

		/* 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach) */
		Iterator ite = arr.iterator();
		while (ite.hasNext())
			System.out.print(ite.next() + "  ");

		System.out.println("\n==================");

		for (Object a : arr) {
			System.out.print(a + "  ");
		}

		System.out.println("\n==================");

		for (int x = 0; x < arr.size(); x++) {
			System.out.print(arr.get(x) + "  ");
		}
		
		
		/* 移除不是java.lang.Number相關的物件 */
		Iterator ite2 = arr.iterator();
		
		while (ite2.hasNext()) {
			Object i = ite2.next();
			if(!(i instanceof Number)) {
				ite2.remove();
			}
		}
		
		/*再次印出這個集合物件的所有元素,觀察是否已將非Number相關的物件移除成功*/
		System.out.println("\n==================");

		for (Object a : arr) {
			System.out.print(a + "  ");
		}
			
	}

}
