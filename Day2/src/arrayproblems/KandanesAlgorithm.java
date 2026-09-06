package arrayproblems;

import java.util.Scanner;

public class KandanesAlgorithm {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array:");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements:");
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }
    int currentsum= arr[0];
    int maxsum =arr[0];
    for(int i=1;i<n;i++) {// 1 2  -1  3
    	if(currentsum + arr[i]>arr[i]) {//1 +2<2
                currentsum=currentsum +arr[i];//3
    	}
    	else {
    		currentsum=arr[i];
    	}
    	if(currentsum >maxsum) {//3>1
    		maxsum=currentsum;//3
    	}
    }
    System.out.println("Maximum sum:"+maxsum);
   
    sc.close();
}
}
