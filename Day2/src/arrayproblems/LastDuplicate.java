package arrayproblems;

import java.util.Scanner;

public class LastDuplicate {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the size of array:");
	int n=sc.nextInt();
	int[]arr=new int[n];
	System.out.println("Enter the elements:");
	for(int i=0;i<n;i++) {
		arr[i] =sc.nextInt();
	}
	int last =-1;
	for(int i=0;i<n;i++) {
		for(int j=i+1;j<n;j++) {
			if(arr[i] == arr[j]) {
				last=arr[i];	
			}
		}
	}
	if(last ==-1) {
		System.out.println("No duplicates");
	}
	else {
		System.out.println(last);
	}
 sc.close();
}
}
