package two_D_Arrays;

import java.util.Scanner;

public class TwoD_Matrix {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
  System.out.println("Enter the size of array:");
  int n=sc.nextInt();
  int arr[][]=new int[n][n];
  System.out.println("Enter the elements of array1:");
  for(int i=0;i<n;i++) {
	  for(int j=0;j<n;j++) {
		  arr[i][j]=sc.nextInt();
	  }
  }
 
}
}
