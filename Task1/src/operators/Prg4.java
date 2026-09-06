package operators;

import java.util.Scanner;

public class Prg4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(num>>1);
		System.out.println(num>>2);
		System.out.println(num>>3);
		
		sc.close();
	}

}
//num=18 24/2^1 (multiple by 2) always base 2 ans:12
