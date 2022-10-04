
public class TestPolygon {
	// Static Binding; Having Overloaded printArea Methods for each Polygon subclass
	public static void printArea(Rectangle rectangle) {
		float area = rectangle.calArea();
		System.out.println("Area of " + rectangle.getPolytype() + " is: " + area);
	}
	
	public static void printArea(Triangle triangle) {
		float area = triangle.calArea();
		System.out.println("Area of " + triangle.getPolytype() + " is: " + area);
	}
	
	// Dynamic Binding; Invoking a Method through a Superclass Variable
	public static void printArea(Polygon polygon) {
		float area = polygon.calArea();
		System.out.println("Area of " + polygon.getPolytype() + " is: " + area);
	}
	
	public static void main(String[] args) {
		Polygon polygon;
		Rectangle rectangle = new Rectangle("TomTheRectangle", 2, 4);
		Triangle triangle = new Triangle("JaneTheTriangle", 6, 8);
		
		// Demonstrate Static Binding
		System.out.println("Static Binding:");
		printArea(rectangle);
		printArea(triangle);
		
		// Demonstrate Dynamic Binding
		System.out.println("\nDynamic Binding:");
		polygon = rectangle;
		printArea(polygon);
		polygon = triangle;
		printArea(polygon);
	}
}
