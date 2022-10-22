
public class SalePerson implements Comparable {
	private String firstName;
	private String lastName;
	private int totalSales;
	
	public SalePerson(String firstName, String lastName, int totalSales) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.totalSales = totalSales;
	}
	
	public String toString() {
		return lastName + ", " + firstName + " : " + totalSales;
	}
	
	public boolean equals(Object o) {
		if (o instanceof SalePerson) {
			SalePerson ob = (SalePerson) o;
			
			if ((ob.getFirstName() == firstName) && (ob.getLastName() == lastName)) {
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}
	
	public int compareTo(Object o) {
		if (o instanceof SalePerson) {
			SalePerson ob = (SalePerson) o;
			
			if (totalSales < ob.getTotalSales()) {
				return -1;
			}
			else if (totalSales > ob.getTotalSales()) {
				return 1;
			}
			else {
				if (ob.getLastName().charAt(0) < lastName.charAt(0)) {
					return -1;
				}
				else {
					return 1;
				}
			}
		}
		return 0;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getTotalSales() {
		return totalSales;
	}
}
