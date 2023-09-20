package hw5;

public class Hw4 {

	public static void main(String[] args) {
		
		MyRectangle rect = new MyRectangle();
		rect.setWidth(10);
		rect.setDepth(20);
		System.out.println(rect.getArea());
		
		MyRectangle rect2 = new MyRectangle(10, 20);
		System.out.println(rect2.getArea());
		
		
	}

}

class MyRectangle {

	private double width;
	private double depth;

	void setWidth(double width) {
		this.width = width;
	}

	void setDepth(double depth) {
		this.depth = depth;
	}

	double getArea() {
		return width * depth / 2;
	}

	public MyRectangle() {

	}

	public MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;
	}
}