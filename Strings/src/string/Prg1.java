package string;

import java.util.Scanner;

public class Prg1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		String emtstr="";
		for(int i=0;i<str.length();i++) {
			int val=(int)(str.charAt(i))-97+1;
			int div=((val%26)+1)+96;
		    emtstr+=(char)div;
		    
		    
		}
		
		System.out.println(emtstr);
	}

}
