package arrayproblems;

import java.util.Scanner;

public class ArrayKRotation {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the size of array:");
	int n=sc.nextInt();

	int[]arr=new int[n];
	System.out.print("Enter the elements:");
	for(int i=0;i<n;i++) {
		arr[i] =sc.nextInt();
	}
	System.out.println("Enter the Rotation:");
	int k=sc.nextInt();
	k=k%n;
	for(int r=1;r<=k;r++) {
		int first=arr[0];// last =n-1
		for(int j=0;j<n-1;j++) {//for(int j=n-1;j>=0;j--);
			arr[j]=arr[j+1];//arr[j]=arr[j-1];
		}
		arr[n-1]=first;//arr[0]=last;
		
	}
	for(int i=0;i<n;i++) {
              System.out.println(arr[i]);
	}
	
}
}
