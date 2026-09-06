package arrays;
// unique elements in array
import java.util.Scanner;

public class UniqueArrayElements {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter the size ofarray:");
		int n=sc.nextInt();
		int[]arr= new int[n];
	    System.out.println("Enter the elements:");
	    for(int i=0;i<n;i++) {
	    	arr[i]=sc.nextInt();
	    }
	    for(int i=0;i<n;i++) {
	    	int count=0;
	    	for(int j=0;j<n;j++) {
	    		if(arr[i]==arr[j]) {
	    			count++;
	    		}
	    	}
	    	if(count == 1) {
	    		System.out.println(arr[i]+" ");
	    	}
	    }
	    sc.close();
	}

}
