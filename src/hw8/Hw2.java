package hw8;

import java.util.*;

public class Hw2 {

	public static void main(String[] args) {
		

		Set<Train> mySet = new TreeSet<>();

		mySet.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		mySet.add(new Train(1254, "區間", "屏東", "基隆", 700));
		mySet.add(new Train(118, "自強", "高雄", "台北", 500));
		mySet.add(new Train(1288, "區間", "新竹", "基隆", 400));
		mySet.add(new Train(122, "自強", "台中", "花蓮", 600));
		mySet.add(new Train(1222, "區間", "樹林", "七堵", 300));
		mySet.add(new Train(1254, "區間", "屏東", "基隆", 700));
        
		
		for (Train a : mySet) {
			System.out.println(a);
		}
		
		
		


	}

}
