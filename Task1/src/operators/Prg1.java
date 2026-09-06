package operators;
import java.util.Scanner;

public class Prg1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(num<<1);
		System.out.println(num<<2);
		System.out.println(num<<3);
		sc.close();
	}

}

// num=8 8*2^1 (multiple by 2) 