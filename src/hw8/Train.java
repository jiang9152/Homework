package hw8;

import java.util.Objects;

public class Train implements Comparable{

	private int number;
	private String type, start, dest;
	private double price;

	public Train(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}

	@Override
	public String toString() {
		return "班次: " + number + "\t車種: " + type + "\t出發地:" + start + "\t目的地:" + dest + " \t票價:" + price;
	}

	@Override
	public int compareTo(Object o) {
		Train t = (Train)o;
		if (number == t.number) {
			return 0;
		}else if (number > t.number) {
			return -1;
		}else {
			return 1;
		}
		
	}
	
	
	public int getNumber() {
		return number;
	}

	public String getType() {
		return type;
	}

	public String getStart() {
		return start;
	}

	public String getDest() {
		return dest;
	}

	public double getPrice() {
		return price;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	

	

}
