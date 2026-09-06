package problems;

import java.util.Scanner;

public class Power {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
    System.out.println("Enter the base:");
    int b =s.nextInt();
    System.out.println("Enter the power:");
    int p =s.nextInt();
    int res=1;
    for(int i=1;i<=p;i++) {
    	res=res*b;
    }
    System.out.println(res);
}
}
