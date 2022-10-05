
public class PlaneSeat {
	private int seatId;
	private boolean assigned = false;
	private int customerId;
	
	// constructor for the class
	PlaneSeat(int seatId) {
		this.seatId = seatId;
		customerId = -1;
	}
	
	// get method that returns the seat number
	public int getSeatID() {
		return seatId;
	}
	
	// get method that returns the customer number
	public int getCustomerID() {
		return customerId;
	}
	
	// method that returns a boolean on whether seat is occupied
	public boolean isOccupied() {
		return assigned;
	}
	
	// method that assigns a seat to customer
	public void assign(int customerId) {
		this.customerId = customerId;
		assigned = true;
	}
	
	// method that unassigns a seat
	public void unAssign() {
		customerId = -1;
		assigned = false;
	}
}
