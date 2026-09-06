package string;

import java.util.Scanner;

public class sample1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		for(int i=0;i<=str.length()-1;i++) {
			char ch=str.charAt(i);
			int val=((int)ch)+1;
			System.out.print((char)val);
		}		
	}
}
