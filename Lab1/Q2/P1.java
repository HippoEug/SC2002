import java.util.Scanner;

public class P1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char choice;
		
		
		System.out.print("Choice: ");
		choice = sc.next().charAt(0);
		
		while(true) {
			if ((choice == 'A') || (choice == 'a')) {
				System.out.println("Action movie fan");
			}
			else if ((choice == 'C') || (choice == 'c')) {
				System.out.println("Comedy movie fan");
			}
			else if ((choice == 'D') || (choice == 'd')) {
				System.out.println("Drama movie fan");
			}
			else if ((choice == 'X') || (choice == 'x')) {
				System.out.println("Bye!");
				break;
			}
			else {
				System.out.println("Invalid choice");
			}
			
			System.out.print("Choice: ");
			choice = sc.next().charAt(0);
		}
	}
}
