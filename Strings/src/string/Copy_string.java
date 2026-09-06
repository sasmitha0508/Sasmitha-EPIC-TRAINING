package string;

import java.util.Scanner;

public class Copy_string {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str1 = in.nextLine();
		String str2="";
	     for(int i=0;i<str1.length();i++) {
				str2+=str1.charAt(i);
        }
	     System.out.println(str2);
	}

}
