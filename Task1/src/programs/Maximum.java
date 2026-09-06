package programs;

import java.util.Scanner;

public class Maximum {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int a=sc.nextInt();
		 int b=sc.nextInt();
		 int c=sc.nextInt();
	     int max=(a>b)? a:b;
	     max=(b>c)?b:c;
         System.out.println("Maximum Number :"+max);
	       
	     sc.close();
	}

}
