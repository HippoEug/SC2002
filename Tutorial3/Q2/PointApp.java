
public class PointApp {
	public static void main(String[] args) {
		String returnedStr;
		
		Point point = new Point(1, 2);
		Circle circle = new Circle(1, 2, 3);
		Cylinder cylinder = new Cylinder(1, 2, 3, 4);
		
		point.setPoint(10, 20);
		returnedStr = point.toString();
		System.out.println(returnedStr);
		
		circle.centre.x = 30;
		circle.centre.y = 40;
		circle.setRadius(50);
		returnedStr = circle.toString();
		System.out.println(returnedStr);
		
		cylinder.centre.x = 60;
		cylinder.centre.y = 70;
		cylinder.setRadius(80);
		cylinder.setHeight(90);
		returnedStr = cylinder.toString();
		System.out.println(returnedStr);
	}
}