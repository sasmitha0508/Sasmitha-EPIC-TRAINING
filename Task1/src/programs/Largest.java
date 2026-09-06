package programs;

import java.util.Scanner;

public class Largest {
public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter two  number:");
     int a=sc.nextInt();
     int b=sc.nextInt();
      if(a>b){
          System.out.println("a is largest");
      }
      else{
          System.out.println("The largest number is: "+b);
      }
      sc.close();
}
}
