package string;

import java.util.Arrays;
import java.util.Scanner;

public class Aanagram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str1=sc.nextLine();
		System.out.println("Enter another string");
		String str2=sc.nextLine();
		char arr1[]=str1.toCharArray();
		Arrays.sort(arr1);
	    char arr2[]=str2.toCharArray();
		Arrays.sort(arr2);
		String convStr1=Arrays.toString(arr1);
		String convStr2=Arrays.toString(arr2);
		if(convStr1.equals(convStr2)) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not a Anagram");
		}
	}

}
