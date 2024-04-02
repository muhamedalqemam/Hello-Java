package courses;

public class IfBranch {

	public static void main(String[] args) {
		int extraCustomers = 4 ;
		
		if(extraCustomers >= 3 & extraCustomers <5) {
			System.out.println("Customers get 30% discount.");
		}
		else if(extraCustomers >= 5) {
			System.out.println("Customers get 50% discount.");
		}
		else {
			System.out.println("There is no discounts.");
		}
	}

}
