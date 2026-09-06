package arrayproblems;

import java.util.Scanner;

public class FrequencyOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//        for (int i = 0; i < n; i++) {
//            boolean alreadyCounted = false;
//            for (int j = 0; j < i; j++) {
//                if (arr[i] == arr[j]) {
//                    alreadyCounted = true;
//                    break;
//                }
//            }
//            if (alreadyCounted) {
//                continue;
//            }
//            int count = 0;
//            for (int j = 0; j < n; j++) {
//                if (arr[i] == arr[j]) {
//                    count++;
//                }
//            }
//
//            System.out.println(arr[i] + " -> " + count);
//        }
        
        for(int i=0;i<n-1;i++) {
        	for(int j=0;j<n-i-1;j++) {
        		if(arr[j] > arr[j+1]) {
        			int temp =arr[j];
        			arr[j] =arr[j+1];
        			arr[j+1]=temp;
        		}
        	}
         }
        		int count =1;
        	for(int i=1;i<n;i++) {
        		if(arr[i]==arr[i-1]) {
        			count++;
        		}
        		else {
        			System.out.println(arr[i-1] + " -> " + count);
        			count=1;
        		}
        	}
        	System.out.println(arr[n-1] + " -> " + count);
        

        sc.close();
    }
}