import java.util.Arrays;

public class Plane {
	private PlaneSeat[] seat = new PlaneSeat[13]; // contains info on seats in plane
	private PlaneSeat[] tempSeat = new PlaneSeat[13]; // temporarily contains info on seats in plane
	private int numEmptySeat; // contains info on empty seats
	
	// constructor for the class
	Plane() {
		numEmptySeat = 12; // Set number of empty seats to 12
		
		// Initialize seat & tempSeat Array with seatId
		for (int i = 0; i < 12; i++) {
			seat[i] = new PlaneSeat(i);
		}
		for (int i = 0; i < 12; i++) {
			tempSeat[i] = new PlaneSeat(i);
		}
	}
	
	// method to sort seats in ascending order of customerID
	// copy of original seat array used for sorting instead of original
	private PlaneSeat[] sortSeats() {
		// customerIdTempArray to store array sorted by customerID
		int[] customerIdTempArray = new int[12-numEmptySeat]; // create temporary array based on number of occupied seats
		int newIndex = 0;
		for (int i = 0; i < 12; i++) {
			if (seat[i].isOccupied()) {
				customerIdTempArray[newIndex++] = seat[i].getCustomerID();
			}
		}

		Arrays.sort(customerIdTempArray); //sort customerID in ascending order
		
		// create & initialize temporary array of PlaneSeat
		PlaneSeat[] planeSeatTemp = new PlaneSeat[12];
		for (int i = 0; i < 12; i++) {
			planeSeatTemp[i] = new PlaneSeat(i);
		}
		
		// storing the position (based on ascending customerID) as the customerID of the new PlaneSeat
		for (int i = 0; i < customerIdTempArray.length; i++) {
			for (int j = 0; j < 12; j++) { // looping through temporary PlaneSeat
				if (customerIdTempArray[i] == seat[j].getCustomerID()) {
					planeSeatTemp[j].assign(i);
					break;
				}
			}
		}
		
		return planeSeatTemp;
	}
	
	// method to display number of empty seats
	public void showNumEmptySeats() {
		System.out.println("There are " + numEmptySeat + " empty seats");
	}
	
	// method to display list of empty seats
	public void showEmptySeats() {
		System.out.println("The following seats are empty: ");
		for (int i = 0; i < (seat.length - 1); i++) {
			if (seat[i].isOccupied() == false) {
				System.out.println("SeatID " + (i + 1));
			}
		}
	}
	
	// method to display assigned seats with seatId & customerId
	// if bySeatId is true, order will be set by seatId, else if
	// if bySeatId is false, order will be set by customerId
	public void showAssignedSeats(boolean bySeatId) {
		System.out.println("The seat assignments are as follow: ");
		if (bySeatId) {
			// order will be set by seatId
			for (int i = 0; i < (seat.length - 1); i++) {
				if (seat[i].isOccupied()) {
					System.out.println("SeatID " + (i+1) + " assigned to CustomerID " + seat[i].getCustomerID() + ". ");
				}
			}
		}
		else {
			// order will be set by customerId, need to do sorting on customerId
			tempSeat = sortSeats();
			for (int i = 0; i < (seat.length - 1); i++) {
				for (int j = 0; j < (seat.length - 1); j++) {
					if (tempSeat[j].getCustomerID() == i) {
						System.out.println("SeatID "+ (j+1) + " assigned to CustomerID " + seat[j].getCustomerID() + ". ");
						break;
					}
				}
			}
		}
	}
	
	// method that assigns customerId to an empty seat
	public void assignSeat(int seatId, int customerId) {
		if (seat[seatId-1].isOccupied()) {
			System.out.println("Seat already assigned to a customer.");
		}
		else {
			seat[seatId-1].assign(customerId);
			numEmptySeat--;
			System.out.println("Seat Assigned!");
		}
	}
	
	// method that unassigns a seat
	public void unAssignSeat(int seatId) {
		if (seat[seatId-1].isOccupied() == false) {
			System.out.println("Seat not assigned to a customer.");
		}
		else {
			seat[seatId-1].unAssign();
			numEmptySeat++;
			System.out.println("Seat Unassigned!");
		}
	}
}
