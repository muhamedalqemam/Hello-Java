package courses;

public class TestLogical {

	public static void main(String[] args) {
		boolean x = 100 > 99 , y = 99 > 100;
		
		//&&
		System.out.println("What is the resault of 100 > 99 && 99 > 100 ?" + (x && y));
		
		//||
		System.out.println("What is the resault of 100 > 99 || 99 > 100 ?" + (x || y));
		
		//^
		System.out.println("What is the resault of 100 > 99 ^ 99 > 100 ?" + (x ^ y));
		
		//!
		System.out.println("What is the resault of not 100 > 99 ! ?" + (! y));
		
		//!
		System.out.println("What is the resault of not 99 > 100 ?" + (! x));
	}

}
