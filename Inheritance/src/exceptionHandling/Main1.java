package exceptionHandling;

import java.util.Scanner;

public class Main1 {
	  int checkAge(int age) throws ArithmeticException{	        
    	  return 10/age;      
    }
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    Main1 m = new Main1();
	    for(;;){
	        int age = in.nextInt();
	        
    	    try{
    	        m.checkAge(age);
    	        System.out.println(m.checkAge(age)+" Is Valid");
    	        break;
    	    }
    	    catch(Exception e){
    	        System.out.println("Enter the Valid Age");
    	    }
	    }
		
	}
}
