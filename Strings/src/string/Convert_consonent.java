package string;

import java.util.Scanner;

public class Convert_consonent {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str1 = in.nextLine();
		char arr[]=new char[str1.length()];
		for(int i=0;i<str1.length();i++) {
			arr[i]=str1.charAt(i);
			if(arr[i] !='a'&&arr[i] !='e'&&arr[i] !='i'&&arr[i] !='o'&&arr[i] !='u') {
				arr[i]='#';
			}
    }
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]); 
			}

	}

}
