package problems;

import java.util.Scanner;

public class Palindrome1 {
	public static void main(String[] args) {	
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the string:");
	String str =sc.nextLine();
	String rev =new StringBuilder(str).reverse().toString();
	if(rev==str) {
		System.out.println("Palindrome");
	}
	else {
		System.out.println(" Not a Palindrome");
	}
}
	
}