package entities;

public class rectangle {
	
	public double width;
	public double heigth;
	
	public double area() {
		return width * heigth;
		
	}
	
	public double perimeter() {
		return 2 * (width + heigth);
	}
	
	
	public double diagonal() {
		return Math.sqrt( Math.pow(width, 2) + Math.pow(heigth, 2) );
		
	}
	

}
