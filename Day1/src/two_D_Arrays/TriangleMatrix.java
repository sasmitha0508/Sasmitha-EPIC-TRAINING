package two_D_Arrays;

import java.util.Scanner;

public class TriangleMatrix {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the number of rows and columns:");
    int n= s.nextInt();
    int arr[][]=new int[n][n];
    
    System.out.println("Enter the array elements:");
    for(int i=0;i<n;i++) {
    	for (int j=0;j<n;j++) {
    		 arr[i][j] =s.nextInt();
    	}
    }
    boolean rt=true;
    boolean lt=true;
    
    for(int i=0;i<n;i++) {
    	for(int j=0;j<n;j++) {
    		if(i>=j &&arr[i][j]!=0) {
    			rt=false;    		
    	}
    	else if((i+j)>=n-1 && arr[i][j]!=0){
    		
    	}
    }
    }
    
    if (rt) {
        System.out.println("Right triangular matrix");
    } 
    else if (lt) {
        System.out.println("Left triangular matrix");
    } 
    else {
        System.out.println("No triangular matrix");
    }
}
}
