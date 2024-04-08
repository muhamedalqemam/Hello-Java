package courses;

public class InstanceVar {
	
	int age = 18;
	
	public void testInstanceVar() {
		int age = 25;
		System.out.println("Most people graduate from school at "+age+" years old.");
	}
	
	public void testInstanceVarAgain () {
		System.out.println("Most people graduate from school at " + ClassStaticVar.age + " years old.");
	}

	public static void main(String[] args) {
		InstanceVar InstaObj = new InstanceVar();
		InstaObj.testInstanceVar();
		InstaObj.testInstanceVarAgain();
		
	}

}
