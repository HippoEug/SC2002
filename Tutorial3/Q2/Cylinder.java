
public class Cylinder extends Circle{
	protected double height;
	
	Cylinder() {
		height = 0;
	}
	
	Cylinder(double height) {
		this.height = height;
	}
	
	Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	
	Cylinder(int x, int y, double radius, double height) {
		super(x, y, radius);
		this.height = 0;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double area() {
		return ((2*PI*radius*height) + (2*PI*radius*radius));
	}
	
	public double volume() {
		return (PI*radius*radius*height);
	}
	
	public String toString() {
		return (super.toString() + ", height = " + height + ", volume = " + volume());
	}
}
