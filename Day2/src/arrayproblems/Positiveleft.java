package arrayproblems;

import java.util.Scanner;

public class Positiveleft {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		int[]arr=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++) {
			arr[i] =sc.nextInt();
		}
		int left =0;
		int right =arr.length-1;
		while(left<right) {
		while((left< right) &&(arr[left]>=0)) {
			left++;
		}
		while((left< right) &&(arr[right] <0)) {
			right--;
		}
		if(left<right) {
			int temp=arr[right];
			arr[right]=arr[left];
			arr[left]=temp;
			left++;
			right--;

		}
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+" ");
		}
		sc.close();
	}
}
