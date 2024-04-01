package courses;

public class MyCalculation extends Calculation{
	
	public void multiplication(int firstNum,int secondNum) {
		total = firstNum * secondNum;
		System.out.println("The multiplication of numbers is :" + total);
	}
	public static void main(String[] args) {
		MyCalculation MyCal = new MyCalculation();
		MyCal.addition(3, 5);
		MyCal.subtraction(3, 5);
		MyCal.multiplication(3, 5);

	}

}
