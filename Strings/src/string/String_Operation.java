package string;

import java.util.Scanner;

public class String_Operation {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	int n=str.length()-1;
	int out=str.charAt(0)-'0';
	for(int i=(n/2)+1;i<=n;i++) {
		int val=str.charAt(i - n / 2) - '0';
		switch(str.charAt(i)) {
		case '-':
			out-=val;
			break;
		case '+':
			out+=val;
			break;
		case '*':
			out*=val;
			break;
		case '/':
			out/=val;
			break;
		case '%':
			out%=val;
			break;
		}
	}
	System.out.println(out);
	
	sc.close();

	}

}
