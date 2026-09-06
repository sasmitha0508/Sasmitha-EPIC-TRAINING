package arrays;

import java.util.Scanner;

public class FrequencyofArray {
public static void main(String[] args) {
	Scanner sc =new Scanner (System.in);
	System.out.println("Enter the size ofarray:");
	int n=sc.nextInt();
	int[]arr= new int[n];
	int[]visit=new int[n];
    System.out.println("Enter the elements:");
    for(int i=0;i<n;i++) {
    	arr[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++) {
    	if(visit[i]==1) {
    		continue;
    	}
    	int count = 1;
    	for(int j=i+1;j<n;j++){
    		if(arr[i]==arr[j]) {
    			count++;
    			visit[j]=1;
    			
    		}
    	}
    	System.out.println(arr[i]+"->"+count);
    }
    sc.close();
}
}
