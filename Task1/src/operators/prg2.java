package operators;

import java.util.Scanner;

public class prg2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(num<<2);
		
		sc.close();
	}

}

//num=5 5*2^2 (multiply by 4) always base is 2