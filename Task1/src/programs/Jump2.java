package programs;

import java.util.Scanner;

public class Jump2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i>8) {
				break;
			}
			System.out.println(i);
		}
       sc.close();	
       }

}
