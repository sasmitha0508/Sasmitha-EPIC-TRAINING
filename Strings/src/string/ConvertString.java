package string;

import java.util.Scanner;

public class ConvertString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		String emtstr="";
		for(int i=0;i<=str.length()-1;i++) {
			if(str.charAt(i)!='z') {
				int val =((int)str.charAt(i))+1;
				emtstr+=((char)val);
			}
			else {
				emtstr+='a';
			}
	}
  System.out.println(emtstr);
}
}