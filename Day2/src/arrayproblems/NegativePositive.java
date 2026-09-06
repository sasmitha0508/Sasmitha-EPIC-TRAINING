package arrayproblems;

import java.util.Scanner;

public class NegativePositive {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the size of array:");
	int n=sc.nextInt();

	int[]arr=new int[n];
	int[]arr1=new int[n];
	System.out.print("Enter the elements:");
	for(int i=0;i<n;i++) {
		arr[i] =sc.nextInt();
	}
	int index=0;
	
    for(int i=0;i<n;i++) {
    	if(arr[i]<0) {
    		arr1[index]=arr[i];
    		index++;
    	}
    }
    	for(int i=0;i<n;i++) {
        	if(arr[i]>=0) {
        		arr1[index]=arr[i];
        		index++;
        	}
    	
    }
    for(int num:arr1) {
    	System.out.print(num +" ");
    }
   
}
}
