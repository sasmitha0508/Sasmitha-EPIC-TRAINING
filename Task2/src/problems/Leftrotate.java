package problems;

import java.util.Scanner;

public class Leftrotate {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
    System.out.println("Enter the size of array:");
    int n=s.nextInt();
    
    int arr[] =new int[n];
    System.out.println("Enter elemnts of array:");
    for(int i=0;i<n;i++) {
    	arr[i]=s.nextInt();
    }
    
    System.out.println("Enter the no.of rotation:");
    int k=s.nextInt();
    k=k%n;
    for(int r=1;r<=k;r++) {
    	int first =arr[0];
    	for(int i=0;i<n-1;i++) {
    		arr[i]=arr[i+1];
    		
    	}
    	arr[n-1]=first;
    	
    	for(int i=0;i<n;i++) {
    		System.out.println(arr[i]);
    	}
    	
    }
    
}
}
