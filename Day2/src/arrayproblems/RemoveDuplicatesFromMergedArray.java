package arrayproblems;

import java.util.Scanner;

public class RemoveDuplicatesFromMergedArray {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the size of first array:");
	int n1=sc.nextInt();
	int[]a1=new int[n1];
	System.out.println("Enter the size of  second array:");
	int n2=sc.nextInt();
	int a2[]=new int[n2];
	int a3[]= new int[n1+n2];
	System.out.println("Enter the elements of first array:");
	for(int i=0;i<n1;i++) {
		a3[i] =sc.nextInt();
	}
	System.out.println("Enter the elements of second array:");
	for(int i=0;i<n2;i++) {
		a3[n1+i] =sc.nextInt();
	}
	 for(int i=0;i<a3.length;i++) {
	    	int count=0;
	    	for(int j=0;j<a3.length;j++) {
	    		if(a3[i]==a3[j]) {
	    			count++;
	    		}
	    	}
	    	if(count == 1) {
	    		System.out.println(a3[i]+" ");
	    	}
	    }

}
}
