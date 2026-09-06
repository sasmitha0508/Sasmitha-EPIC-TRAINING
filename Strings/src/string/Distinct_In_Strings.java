package string;

import java.util.Scanner;

public class Distinct_In_Strings {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str2=sc.nextLine();
		int count[]=new int[26];
		for(int i=0;i<str2.length();i++) {
			if(str2.charAt(i)>='A'&& str2.charAt(i)<='Z') {
				int val=str2.charAt(i)-'A';
				count[val]++;
			}
			else {
				int val=str2.charAt(i)-'a';
				count[val]++;	
			}					
		}
		for(int i=0;i<str2.length();i++) {
			if(str2.charAt(i)>='A'&& str2.charAt(i)<='Z') {
			if(count[str2.charAt(i)-'A']==1) {
				System.out.println(str2.charAt(i));
				count[str2.charAt(i)-'A']=0;
			}
			}else {
				if(count[str2.charAt(i)-'a']==1) {
					System.out.println(str2.charAt(i));
					count[str2.charAt(i)-'a']=0;
			}
		}
        
	}


	}

}
