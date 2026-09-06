package exceptionHandling;

import java.util.Scanner;

class PhNumberNotValidException extends Exception{
	PhNumberNotValidException(String msg){
		super(msg);
	}
}
class StoreData{
	void display(String ph ) throws  PhNumberNotValidException{
		if(ph.length()!=10) {
		throw new PhNumberNotValidException("The given number is not valid");
		}else {
			System.out.println("Phone Number is valid");
		}
	}
}

public class ManualException {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	StoreData sd=new StoreData();
	try {
		System.out.println("Enter your number:");
		String ph=sc.nextLine();
		sd.display(ph);
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
