package exercise01;

public class Rectangle {
	public double width;
	public double height;
	
	public double Area() {
		return this.width*this.height;
	}
	
	public double Perimeter() {
		return (2*this.width) + (2*this.height);
	}
	
	public double Diagonal() {
		double sideA = Math.pow(height, 2);
		double sideB = Math.pow(width, 2);
		return Math.sqrt(sideA + sideB);
	}
}
