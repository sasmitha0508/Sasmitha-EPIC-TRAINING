package arrayproblems;

import java.util.Scanner;

public class FirstDuplicate {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the size of array:");
	int n=sc.nextInt();
	int[]arr=new int[n];
	System.out.println("Enter the elements:");
	for(int i=0;i<n;i++) {
		arr[i] =sc.nextInt();
	}
	for(int i=0;i<n;i++) {
		for(int j=i+1;j<n;j++) {
			if(arr[i] == arr[j]) {
				System.out.println(arr[i]);
				return;		
			}
		}
	}
	System.out.println("No duplicates");
	
	sc.close();
}
}
