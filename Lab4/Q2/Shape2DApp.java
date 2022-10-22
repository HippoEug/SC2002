
import java.util.Scanner;

public class Shape2DApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numShapes = 0;
		int shapeChoice = 0;
		int tempLength, tempWidth, tempHeight, tempBase;
		double totalArea = 0;
		double output = 0;
		
		System.out.print("Enter the total number of shapes: ");
		numShapes = sc.nextInt();
		Shape shapeArray[] = new Shape[numShapes];
		
		for (int i=0; i<numShapes; i++) {
			shapeChoice = 0;
			System.out.println("\nChoose Figure #" + (i+1));
			System.out.println("Choose your Shape \n1: Circle\n2: Rectangle\n3: Square\n4: Triangle");
			
			do {
				shapeChoice = sc.nextInt();
				switch(shapeChoice) {
					case 1:
						System.out.println("	Circle chosen");
						System.out.print("	Enter radius: ");
						Circle circle = new Circle(sc.nextInt());
						shapeArray[i] = circle;
						// System.out.println("	Area is " + circle.getArea());
						// totalArea += circle.getArea();
						break;
						
					case 2:
						System.out.println("	Rectangle chosen");
						System.out.print("	Enter length: ");
						tempLength = sc.nextInt();
						System.out.print("	Enter width: ");
						tempWidth = sc.nextInt();
						Rectangle rectangle = new Rectangle(tempLength, tempWidth);
						shapeArray[i] = rectangle;
						// System.out.println("	Area is " + rectangle.getArea());
						// totalArea += rectangle.getArea();
						break;
						
					case 3:
						System.out.println("	Square chosen");
						System.out.print("	Enter side: ");
						Square square = new Square(sc.nextInt());
						shapeArray[i] = square;
						// System.out.println("	Area is " + square.getArea());
						// totalArea += square.getArea();
						break;
						
					case 4:
						System.out.println("	Triangle chosen");
						System.out.print("	Enter height: ");
						tempHeight = sc.nextInt();
						System.out.print("	Enter base: ");
						tempBase = sc.nextInt();
						Triangle triangle = new Triangle(tempHeight, tempBase);
						shapeArray[i] = triangle;
						// System.out.println("	Area is " + triangle.getArea());
						// totalArea += triangle.getArea();
						break;
						
					default:
						shapeChoice = 0;
				}
			} while (shapeChoice == 0);		
		}
		
		// System.out.println(String.format("\nTotal area of all the shape is/are: %f", totalArea));
		
		for (int i = 0; i < numShapes; i++) {
            double area = shapeArray[i].getArea();
            output += area;
        }
        System.out.println("\nTotal Area = " + output);
	}
}
