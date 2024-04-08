package courses;

public class TestSwitchCase {

	public static void main(String[] args) {
		int day = 1 ;
		switch (day) {
		case 1 :
			System.out.println("This is Saturday.");
			break;
		case 2 :
			System.out.println("This is Sunday.");
			break;
		case 3 :
			System.out.println("This is Monday.");
			break;
		case 4 :
			System.out.println("This is Tuesday.");
			break;
		case 5 :
			System.out.println("This is wednesday.");
			break;
		case 6 :
			System.out.println("This is Thursday.");
			break;
		case 7 :
			System.out.println("This is Friday.");
			break;
		default :
			System.out.println("The week has only 7 days.");
			break;
		}
		
	}

}
