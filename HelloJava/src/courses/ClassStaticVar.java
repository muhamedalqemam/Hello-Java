package courses;

public class ClassStaticVar {
	
	static int age = 16;
	
	public static void testStaticVar() {
		System.out.println("This is test static variable.");
	}

	public static void main(String[] args) {
		System.out.println("this is usage of static int age > " + ClassStaticVar.age);
		ClassStaticVar.testStaticVar();

	}

}
