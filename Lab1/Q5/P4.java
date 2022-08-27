import java.util.Scanner;

public class P4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int height, heightLoop, horizontalCount, count;
		
		System.out.print("Enter Height: ");
		height = sc.nextInt();
		System.out.println("");
		
		if (height <= 0) {
			System.out.println("ERROR INPUT!");
			System.exit(0);
		}
		
		for (heightLoop = 0; heightLoop < height; heightLoop++) {
			horizontalCount = heightLoop;
			for (count = 1; count <= horizontalCount+1; count++) {
				if (count%2 == 0) {
					if (heightLoop%2 == 0) {
						System.out.print("BB");
					}
					else {
						System.out.print("AA");
					}
				}
				else {
					if (heightLoop%2 == 0) {
						System.out.print("AA");
					}
					else {
						System.out.print("BB");
					}
				}
			}
			System.out.println("");
		}
	}
}
