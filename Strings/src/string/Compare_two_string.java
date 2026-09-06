package string;

import java.util.Scanner;

public class Compare_two_string {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str1 = in.nextLine();
		System.out.println("Enter the another string:");
		String str2 = in.nextLine();
		int len = str1.length();
        if (str2.length() < len) {
            len = str2.length();
        }
		   int result = 0;
	        for (int i = 0; i < len; i++) {

	            if (str1.charAt(i) > str2.charAt(i)) {
	                result = 1;
	                break;
	            }

	            if (str1.charAt(i) < str2.charAt(i)) {
	                result = -1;
	                break;
	            }
	            }
	        if (result == 1) {
	            System.out.println("String 1 is greater");
	        }
	        else if (result == -1) {
	            System.out.println("String 1 is smaller");
	        }
	        else if (str1.length() == str2.length()) {
	            System.out.println("Equal");
	        }
	        else if (str1.length() > str2.length()) {
	            System.out.println("String 1 is greater");
	        }
	        else {
	            System.out.println("String 1 is smaller");
	        }

		
	}

}
