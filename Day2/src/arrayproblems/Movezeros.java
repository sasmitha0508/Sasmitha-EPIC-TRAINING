package arrayproblems;

import java.util.Scanner;

public class Movezeros {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the size of array:");
	int n=sc.nextInt();

	int[]arr=new int[n];
	System.out.print("Enter the elements:");
	for(int i=0;i<n;i++) {
		arr[i] =sc.nextInt();
	}
	int j=0;
	for(int i=0;i<n;i++) {
		if(arr[i]!=0) {
			int temp =arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			j++;
			
		}
	}
	for(int i=0;i<n;i++) {
		System.out.println(arr[i]+" ");
	}
}
}
