package exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
public static void main(String[] args) {
	File f=new File("C:\\Users\\Sashimitha\\OneDrive\\Documents\\text.txt");
	try {
		FileReader fr =new FileReader(f);
	}catch(FileNotFoundException e) {
		e.printStackTrace();
		System.out.println("File not found");
	}
	catch(ArithmeticException a) {
		a.printStackTrace();
	}
	finally {
		System.out.println("Executed successfully");
	}
}
}
//public static void main(String[] args)throws FileNotFoundException,ArithmeticException  { -automatically handle the error 
//File f=new File("text.txt");
//FileReader fr =new FileReader(f);


