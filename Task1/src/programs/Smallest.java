package programs;

import java.util.Scanner;

public class Smallest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers");
	     int a=sc.nextInt();
	     int b=sc.nextInt();
	     int c=sc.nextInt();
	     if(a<b) {
	    	 if(a<c) {
	    	 System.out.println(a +" is smaller");
	    	 }
	     }
	     else if(b<a) {
	    	 if(b<c) {
	    	 System.out.println(b+" is smaller");
	    	 }
	     }
	     
	     else if(c<a) {
	    	 if(c<b) {
	    	 System.out.println(c+" is smaller");
	    	 }
	     }
	     else {
	    	 System.out.println("All are equal");
	     }
	     sc.close();
	}
	
}
