package string;

import java.util.Scanner;

public class String_reverse {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		    String str=sc.nextLine();
		    String rev=" ";
		    for(int i=str.length()-1;i>=0;i--) {
		    	rev+=str.charAt(i);
		    }
		    System.out.println(rev);

	}

}
