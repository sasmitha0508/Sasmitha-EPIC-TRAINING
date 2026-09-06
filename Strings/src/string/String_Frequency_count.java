package string;

import java.util.Scanner;

public class String_Frequency_count {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		int arr[]=new int[26];
		for(int i=0;i<str.length();i++) {
			int val=str.charAt(i)-97;
			arr[val]++;
		}
        for(int i=0;i<str.length();i++) {
        	int val = str.charAt(i) - 97;
		    if(arr[val]>0){
		        System.out.println(str.charAt(i)+" "+arr[val]);
		    }
		    if(arr[val]>1){
		        arr[val]=0;
		    }
        }
	}
}
