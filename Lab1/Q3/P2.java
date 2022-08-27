import java.util.Scanner;

public class P2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int salary, merit;
		
		System.out.print("Salary: $");
		salary = sc.nextInt();
		System.out.print("Merit: ");
		merit = sc.nextInt();
		
		while (true) {
			if ((salary == 0)) {
				System.out.println("Bye!");
				break;
			}
			// Grade C Range
			else if ((salary >= 500) && (salary <= 649)) {
				if ((salary >= 600) && (salary <= 649) && (merit >= 10)) {
					System.out.println("Grade B");
				}
				else {
					System.out.println("Grade C");
				}
			}
			// Grade B Range
			else if ((salary >= 600) && (salary <= 799)) {
				if ((salary >= 600) && (salary <= 649) && (merit < 10)) {
					System.out.println("Grade C");
				}
				else if ((salary >= 700) && (salary <=799) && (merit >= 20)) {
					System.out.println("Grade A");
				}
				else {
					System.out.println("Grade B");
				}
			}
			// Grade A Range
			else if ((salary >= 700) && (salary <= 899)) {
				if ((salary >= 700) && (salary <=799) && (merit < 20)) {
					System.out.println("Grade B");
				}
				else {	
					System.out.println("Grade A");
				}
			}
			else {
				System.out.println("Invalid Inputs");
			}
			
			System.out.print("\nSalary: $");
			salary = sc.nextInt();
			System.out.print("Merit: ");
			merit = sc.nextInt();
		}
	}
}
