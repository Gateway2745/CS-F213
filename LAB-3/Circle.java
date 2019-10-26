package lab3;

public class Circle{
	final double PI; 
	private double radius;
	 
	Circle(double radius) {
	 this.radius = radius;
	 PI = 3.141;
	}
	 
	public double getRadius() {return radius;}
	
	public void setRadius(double radius) {this.radius = radius;}
	 
	public double area() {return(PI * radius * radius);}
	 
	public final void getCircumference(double radius) {
	
	System.out.println("Circumference = " + 2 * PI * radius);
	 }
}
