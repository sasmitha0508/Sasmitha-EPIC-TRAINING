package arrays;

import java.util.Scanner;

public class Subarray {
public static void main(String[] args) {
	try (Scanner sc = new Scanner (System.in)) {
		System.out.println("Enter the size ofarray:");
		int n=sc.nextInt();
		int[]arr= new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				int sum=0;
				for(int k=i;k<=j;k++) {
					sum +=arr[k];
				}
			}
		}

	}
}
}
