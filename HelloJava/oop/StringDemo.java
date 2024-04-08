package oop;

public class StringDemo {

	public static void main(String[] args) {
		String greeting = "Hello World!";
		int len = greeting.length();
		String FirstName = "Mohamed ";
		String LastName = "Mostafa";
		String FullName = FirstName.concat(LastName);
		
		System.out.println(greeting);
		System.out.println(len);
		System.out.println(FirstName + LastName);
		System.out.println(FullName);
	}

}
