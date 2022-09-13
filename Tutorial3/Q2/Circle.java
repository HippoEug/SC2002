
public class Circle{
	protected double radius;
	protected Point centre;
	protected static final double PI = 3.14159;
	
	Circle() {
		centre = new Point();
		radius = 0;
	}
	
	Circle(double radius) {
		centre = new Point();
		this.radius = radius;
	}
	
	Circle(int x, int y, double radius) {
		centre = new Point(x, y);
		this.radius = radius;
	}
	
	public void setRadius(double radius) {
		if (radius >= 0) {
			this.radius = radius;
		}
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double area() {
		return (PI*radius*radius);
	}
	
	public String toString() {
		return (centre.toString() + ", radius = " + radius + ", area = " + area());
	}
}
