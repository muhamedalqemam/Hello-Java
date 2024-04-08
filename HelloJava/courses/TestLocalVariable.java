package courses;

public class TestLocalVariable {

	public void testLocalVariable() {
		int age = 34;
		System.out.println("How old are you? " + age);
	}
	
	public void testSameLocalVariable() {
		int age = 36;
		System.out.println("How old are you? " + age);
	}
	
	public void testvariable(int age) {
		System.out.println("My age is " + age + " years old.");
	}
	
	public static void main(String[] args) {
		TestLocalVariable testClass = new TestLocalVariable();
		testClass.testLocalVariable();
		testClass.testSameLocalVariable();
		testClass.testvariable(30);

	}
}
