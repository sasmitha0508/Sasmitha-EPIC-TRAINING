package problems;

import java.util.Scanner;
import java.util.Arrays;

public class Multidimensional {
 public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the number of rows:");
    int r= s.nextInt();
    System.out.println("Enter the number of columns:");
    int c= s.nextInt();
    int arr[][]= new int[r][c];
    
    System.out.println("Enter the array elements:");
    for(int i=0;i<r;i++) {
    	for (int j=0;j<c;j++) {
    		 arr[i][j] =s.nextInt();
    	}
    }
   System.out.println(Arrays.deepToString(arr));
   //->another way to display array elements 
    
//    for(int[] k: arr) {
//    	for(int q:k) {
//    		System.out.print(q +" ");		
//    	}
//    	System.out.println("");
//    }
   s.close();
}
}
