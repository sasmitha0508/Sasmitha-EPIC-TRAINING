package string;

import java.util.Scanner;

public class Occurence_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str1=sc.nextLine();
		int arr1[]=new int[26];
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i) >='A'&& str1.charAt(i)<='Z') {
				int val=str1.charAt(i)-'A';
				arr1[val]++;
			}
			else {
			int val=str1.charAt(i)-'a';
			arr1[val]++;
			}
		}
		for(int i=0;i<str1.length();i++) {
			if(arr1[str1.charAt(i)-'a']>1) {
				System.out.println((str1.charAt(i))+"->"+arr1[str1.charAt(i)-'a']);
			}
		}
	}

}
