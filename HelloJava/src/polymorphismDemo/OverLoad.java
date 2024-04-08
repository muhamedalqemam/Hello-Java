package polymorphismDemo;

public class OverLoad {
	public void demo(int a) {
		System.out.println("a : " + a);
	}
	
	public void demo(int a, int b) {
		System.out.println("a,b : " + a + "," + b);
	}
	
	public double demo(double a) {
		System.out.println("double a : " + a);
		return a*a;
	}
}
