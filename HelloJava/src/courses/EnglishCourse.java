package courses;

//ClassName
public class EnglishCourse {
	
	//Variables
	int students;
	int weeks;
	int days;
	
	//Method
	public static void main(String[] args) {
		
		//Object
		EnglishCourse Eng101 = new EnglishCourse();
		int totalDays;
		Eng101.students = 10;
		Eng101.weeks = 4;
		Eng101.days = 3;
		totalDays = Eng101.weeks * Eng101.days;
		System.out.println("the English 101 course is total of " + totalDays + " days");
	}

}
