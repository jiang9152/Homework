package hw5;

public class Hw6 {

	public static void main(String[] args) {
		
		Pen[] arr = new Pen[2];
		
		arr[0] = new Pencil("雄獅", 30);
		arr[1] = new InkBrush("蕙風堂", 80);
		
		for (Pen p : arr) {
			System.out.println("價格為: " + p.getPrice());
			p.write();
			System.out.println("==============");
		}

	}

}

// Parent Class
abstract class Pen {

	private String brand;
	private double price;

	// constructor
	Pen() {
	}

	Pen(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}

	// getter method
	String getBrand() {
		return brand;
	}

	double getPrice() {
		return price;
	}

	// setter method
	void setBrand(String brand) {
		this.brand = brand;
	}

	void setPrice(double price) {
		this.price = price;
	}

	// write abstract method
	abstract void write();
}

//Child Class
class Pencil extends Pen {
    
	Pencil(String brand, double price){
		super(brand, price);
	}
	
	Pencil(){
	}
	
	@Override
	double getPrice() {
		return (super.getPrice() * 0.8);
	}
	
	@Override
	void write() {
		System.out.println("削鉛筆再寫");
	}
}

//Child Class
class InkBrush extends Pen {

	InkBrush(String brand, double price){
		super(brand, price);
	}
	
	InkBrush(){
	}
	
	@Override
	double getPrice() {
		return (super.getPrice() * 0.9);
	}
	
	@Override
	void write() {
		System.out.println("沾墨汁再寫");
	}
}