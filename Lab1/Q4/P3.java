import java.util.Scanner;

public class P3 {
	private static final double CONV_RATE_US_SG = 1.82;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int starting, ending, increment, i;
		
		System.out.print("starting: ");
		starting = sc.nextInt();
		System.out.print("ending: ");
		ending = sc.nextInt();
		System.out.print("increment: ");
		increment = sc.nextInt();
		
		if (starting > ending) {
			System.out.println("\nERROR INPUT!");
			System.exit(0);
		}
		
		System.out.println("\nFor Loop");
		System.out.println("US$       S$");
		System.out.println("---------------");
		for (i = starting; i <= ending; i = i + increment) {
			System.out.println(i + String.format("%1$13s", i*CONV_RATE_US_SG));
			//System.out.println(i + "         " + i*CONV_RATE_US_SG);
		}
		
		System.out.println("\nWhile Loop");
		System.out.println("US$       S$");
		System.out.println("---------------");
		i = starting;
		while (i <= ending) {
			System.out.println(i + String.format("%1$13s", i*CONV_RATE_US_SG));
			i = i + increment;
			
		}
		
		System.out.println("\nDo While Loop");
		System.out.println("US$       S$");
		System.out.println("---------------");
		i = starting;
		do {
			System.out.println(i + String.format("%1$13s", i*CONV_RATE_US_SG));
			i = i + increment;
		} while (i <= ending);
	}
}
