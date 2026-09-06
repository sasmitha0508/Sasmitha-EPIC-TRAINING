package arrayproblems;

import java.util.Scanner;

public class LongestSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the K value: ");
        int k = sc.nextInt();

        int left = 0;
        int sum = 0;
        int maxLength = 0;
        int start = -1;
        int end = -1;

        for (int right = 0; right < n; right++){//1 2 3 2 1 2 

            // Add current element to the window
            sum += arr[right];//1 2 3 - window , sum=6

            // Shrink the window if sum becomes greater than k
            while (sum > k && left <= right) {   //k=6 so,it not skill this 
                sum -= arr[left];
                left++;
            }

            // Check if current window sum is equal to k
            if (sum == k) {// sum (6) == k(6) 
                int length = right - left + 1; //2-0+1=3

                if (length > maxLength) {//3>0
                    maxLength = length;//maxlength=3
                    start = left;
                    end = right;
                }
            }
        }

        if (maxLength == 0) {
            System.out.println("No subarray found with sum = " + k);
        } else {
            System.out.println("Longest Subarray Length: " + maxLength);
            System.out.print("Subarray: ");
            for (int i = start; i <= end; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}