
import java.util.Scanner;

public class Shape3DApp {

	public static void main(String args[]) {
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
			System.out.println("Choose your Shape \n1: Sphere\n2: Cuboid\n3: Cube\n4: Pyramid");
			
			do {
				shapeChoice = sc.nextInt();
				switch(shapeChoice) {
					case 1:
						System.out.println("	Sphere chosen");
						System.out.print("	Enter radius: ");
						Sphere sphere = new Sphere(sc.nextInt());
						shapeArray[i] = sphere;
						// System.out.println("Volume is " + sphere.getVolume());
						// System.out.println("	Surface Area is " + sphere.getSurfaceArea());
						// totalArea += sphere.getSurfaceArea();
						break;
						
					case 2:
						System.out.println("	Cuboid chosen");
						System.out.print("	Enter length: ");
						tempLength = sc.nextInt();
						System.out.print("	Enter width: ");
						tempWidth = sc.nextInt();
						System.out.print("	Enter height: ");
						tempHeight = sc.nextInt();
						Cuboid cuboid = new Cuboid(tempLength, tempWidth, tempHeight);
						shapeArray[i] = cuboid;
						// System.out.println("Volume is " + cuboid.getVolume());
						// System.out.println("	Surface Area is " + cuboid.getSurfaceArea());
						// totalArea += cuboid.getSurfaceArea();
						break;
						
					case 3:
						System.out.println("	Cube chosen");
						System.out.print("	Enter side: ");
						Cube cube = new Cube(sc.nextInt());
						shapeArray[i] = cube;
						// System.out.println("Volume is " + cube.getVolume());
						// System.out.println("	Surface Area is " + cube.getSurfaceArea());
						// totalArea += cube.getSurfaceArea();
						break;
						
					case 4:
						System.out.println("	Pyramid chosen");
						System.out.print("	Enter height: ");
						tempHeight = sc.nextInt();
						System.out.print("	Enter base: ");
						tempBase = sc.nextInt();
						Pyramid pyramid = new Pyramid(tempHeight, tempBase);
						shapeArray[i] = pyramid;
						// System.out.println("Volume is " + pyramid.getVolume());
						// System.out.println("	Surface Area is " + pyramid.getSurfaceArea());
						// totalArea += pyramid.getSurfaceArea();
						break;
						
					default:
						shapeChoice = 0;
				}
			} while (shapeChoice == 0);			
		}
		
		// System.out.println(String.format("\nTotal area of all the shapes is/are: %f", totalArea));
		
		for (int i = 0; i < numShapes; i++) {
            double surfaceArea = ((_3d)shapeArray[i]).getSurfaceArea();
            output += surfaceArea;
        }
        System.out.println("\nTotal Area = " + output);
	}
}
