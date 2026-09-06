package arrays;

import java.util.Scanner;

public class RemoveDuplicates {
public static void main(String[] args) {
	Scanner sc =new Scanner (System.in);
	System.out.println("Enter the size ofarray:");
	int n=sc.nextInt();
	int[]arr= new int[n];
    System.out.println("Enter the elements:");
    for(int i=0;i<n;i++) {
    	arr[i]=sc.nextInt();
    }
    
//    for(int i=0;i<n;i++) {
//    	boolean found =false;
//    	for(int j=0;j<i;j++) {
//    		if(arr[i]==arr[j]) {
//    			found =true;
//    			break;
//    		}
//    	}
//    	 if(!found) {
//    	    	System.out.println(arr[i]+" ");
//    	    }
//    }
    
//  for(int i=0;i<n;i++) {
//	int count=0;
//	for(int j=0;j<i;j++) {
//		if(arr[i]==arr[j]) {
//			count++;
//		}
//	}
//	 if(count==0) {
//	    	System.out.println(arr[i]+" ");
//	    }
//}
//    Two Pointers
    int k=0;
    for(int i=0;i<n;i++) {
    	boolean found =false;
    	for(int j=0;j<k;j++) {
    		if(arr[i]==arr[j]) {
    			found =true;
    			break;
    		}
    	}
    	 if(!found) {
    	    	arr[k]=arr[i];
    	    	k++;
    }
    	 }
    for(int i=0;i<k;i++) {
		 System.out.println(arr[i]+"");
	 }
    sc.close();
}
}
