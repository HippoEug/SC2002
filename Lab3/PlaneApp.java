import java.util.Scanner;

public class PlaneApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int userOption;
		int userInput1, userInput2;
		
		Plane plane = new Plane();
		printOptions();
		
		do {
			System.out.print("\n	Enter the number of your choice: ");
			userOption = sc.nextInt();
			
			switch(userOption) {
			case 1:
				// (1) Show number of empty seats
				plane.showNumEmptySeats();
				break;
				
			case 2:
				// (2) Show the list of empty seats
				plane.showEmptySeats();
				break;
				
			case 3:
				// (3) Show the list of seat assignments by seat ID
				plane.showAssignedSeats(true); // show seat assignments by seatId
				break;
			
			case 4:
				// (4) Show the list of seat assignments by customer ID
				plane.showAssignedSeats(false); // show seat assignments by customerId
				break;
				
			case 5:
				// (5) Assign a customer to a seat
				System.out.println("Assigning Seat ..");
				System.out.print("	Please enter seatID: ");
				userInput1 = sc.nextInt();
				System.out.print("	Please enter customerID: ");
				userInput2 = sc.nextInt();
				
				plane.assignSeat(userInput1, userInput2);
				break;
				
			case 6:
				// (6) Remove a seat assignment
				System.out.print("	Enter SeatID to unassign customer from: ");
				userInput1 = sc.nextInt();
				
				plane.unAssignSeat(userInput1);
				break;
				
			case 7:
				break;
				
			default:
				System.out.println("Invalid Option!");
			}
			
		} while (userOption != 7);
	}
	
	public static void printOptions() {
		System.out.println("(1) Show number of empty seats");
		System.out.println("(2) Show the list of empty seats");
		System.out.println("(3) Show the list of seat assignments by seat ID");
		System.out.println("(4) Show the list of seat assignments by customer ID");
		System.out.println("(5) Assign a customer to a seat");
		System.out.println("(6) Remove a seat assignment");
		System.out.println("(7) Exit");
	}
}
