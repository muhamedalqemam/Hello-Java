package abstractTest;

public class Dog extends Animal {
	

	public static void main(String[] args) {
		
		Animal obj = new Dog();
		obj.sound();
		
	}

	public void sound() {
		System.out.println("Woof");
	}

}
