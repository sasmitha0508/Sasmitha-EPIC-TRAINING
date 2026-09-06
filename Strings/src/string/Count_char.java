package string;

import java.util.Scanner;

public class Count_char {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
	    int count=0;
		for(int i=0;i<str.length();i++) {
	        count++;
		}
		System.out.print(count);
		sc.close();

	}

}
