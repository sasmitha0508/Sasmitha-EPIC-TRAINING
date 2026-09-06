package string;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    String emtstr=" ";
    for(int i=0;i<str.length();i++) {
    	emtstr+=str.charAt(i);
    }
    System.out.println(emtstr);
	}

}
