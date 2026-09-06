package programs;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int rev =0;
		while(n!=0) {
//			int digit =n%10;
		    rev =(rev * 10) +(n%10);
			n/=10;
			
		}
		System.out.print(rev);
		sc.close();
	}

}
