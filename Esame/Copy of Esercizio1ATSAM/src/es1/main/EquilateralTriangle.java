package es1.main;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class EquilateralTriangle extends Shape {
	
	private double base;
	private double height;
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public double area(){
		return (getBase() * getHeight()) / 2;
	}
	
	@Override
	public double perimeter() {
		return getBase() * 3;
	}
}
