package string;

import java.util.Scanner;

public class Count_char_string {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the string:");   
		String str=sc.nextLine();
	    System.out.println ("Enter the Character to find:");   
	    char c=sc.next().charAt(0);
	    boolean found=false;
		for(int i=0;i<str.length();i++) {
	    if(str.charAt(i)==c){
	      found=true;
	      break;
	    }
		}
		 if(found) {
		    	System.out.println("Found");
		    }
		    else{
		        System.out.println("Not Found");
		    }
		sc.close();
	}

}
