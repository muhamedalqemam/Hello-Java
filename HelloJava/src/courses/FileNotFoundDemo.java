package courses;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundDemo {

	public static void main(String[] args) throws FileNotFoundException {
		//File file = new File("c://file.txt");
		//FileReader fr = new FileReader(file);
		try {
			FileNotFoundDemo demo = new FileNotFoundDemo();
			demo.TestArray();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception thrown is : " + e);
		}
		System.out.println("Your number is out of the block.");
	}
	
	public void TestArray() {
		int Num[] = {1,2,3,4};
		System.out.println(Num[5]);
	}

}
