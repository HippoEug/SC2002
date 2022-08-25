import java.util.Scanner;

public class CircleApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int userOption;
		double radius;
		
		printMenu();
		System.out.println("Choose option (1-3):");
		userOption = sc.nextInt();
		
		Circle circle1 = new Circle(0);
		
		while (userOption != 4) {
			switch(userOption) {
			case 1:
				System.out.println("Enter the radius to compute the area and circumference");
				radius = sc.nextDouble();
				
				circle1.setRadius(radius);
				System.out.println("A new circle is created");
				break;
			case 2:
				System.out.println("Area of circle");
				System.out.println("Radius: " + circle1.getRadius());
				circle1.printArea();
				break;
			case 3:
				System.out.println("Circumference of circle");
				System.out.println("Radius: " + circle1.getRadius());
				circle1.printCircumference();
				break;
			default:
				System.out.println("Error: NOT AN OPTION!");
			}
			
			System.out.println("Choose option (1-3):");
			userOption = sc.nextInt();
		}
		System.out.print("Thank you!!");
	}
	
	public static void printMenu() {
		System.out.println("==== Circle Computation =====");
		System.out.println("|1. Create a New Circle     |");
		System.out.println("|2. Print Area              |");
		System.out.println("|3. Print Circumference     |");
		System.out.println("|4. Quit                    |");
		System.out.println("=============================");
	}
}
