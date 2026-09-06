package programs;

import java.util.Scanner;

public class Alphabetic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c=sc.next().charAt(0);
		if ((c >='A'&& c<= 'Z') || (c >='a'&& c<= 'z'))
		    System.out.println("Alphabet");
		else
			System.out.println("Not Alphabet");
		sc.close();
	}

}
