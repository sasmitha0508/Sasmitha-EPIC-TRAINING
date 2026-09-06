package problems;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
     Scanner s =new Scanner(System.in);
     System.out.println("Enter a number:");
     int n=s.nextInt();
      int org=n;
      int sum=0;
      while(n!=0) {
    	  int digit=n%10;
    	  sum=sum+(digit*digit*digit);
    	  n=n/10;
      }
     if(org==sum) {
    	 System.out.println("Armstrong number");
     }
     else {
    	 System.out.println("Not Armstrong number");
     }
	}

}
