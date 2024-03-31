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
	
	public static void main(String[] args) {
		TestLocalVariable testClass = new TestLocalVariable();
		testClass.testLocalVariable();
		testClass.testSameLocalVariable();

	}
}
