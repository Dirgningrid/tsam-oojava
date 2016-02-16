package es1.main;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Statistics {
	
	private double perimeter;
	private double area;		
	
	public double getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
	
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public Statistics(double p, double a){
		this.perimeter = p;
		this.area = a;
	}	
	
	public void add(Statistics s){
		this.perimeter += s.getPerimeter();
		this.area += s.getArea();		
	}

}
