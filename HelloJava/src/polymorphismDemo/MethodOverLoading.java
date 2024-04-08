package polymorphismDemo;

public class MethodOverLoading {

	public static void main(String[] args) {
		OverLoad obj = new OverLoad();
		double result;

		obj.demo(10);
		obj.demo(10, 20);

		result = obj.demo(5.5);
		System.out.println("Final Result : "+ result);
	}

}
