package problems;
import java.util.*;

public class Sum2Dmatrix {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the number of rows:");
    int r= s.nextInt();
    System.out.println("Enter the number of columns:");
    int c= s.nextInt();
    int arr[][]= new int[r][c];
    int arr1[][]= new int[r][c];
    int  sum[][]=new int[r][c];
    
    System.out.println("Enter the elements of array:");
    for (int i=0;i<r;i++) {
    	for(int j=0;j<c;j++) {
    		arr[i][j]=s.nextInt();
    	}
    }
    System.out.println("Enter the elements of array1:");
    for (int i=0;i<r;i++) {
    	for(int j=0;j<c;j++) {
    		arr1[i][j]=s.nextInt();
    	}
    }
	
    for (int i=0;i<r;i++) {
    	for(int j=0;j<c;j++) {
    		sum[i][j]=arr[i][j] +arr1[i][j];
    		
    	}
    }
    
    System.out.println(Arrays.deepToString(sum));
    s.close();
}
}
