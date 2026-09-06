package arrayproblems;

import java.util.Scanner;

public class TrainProblem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of trains:");
		int n =sc.nextInt();
		int arr[]=new int[n];
		int dep[]=new int[n];
		System.out.println("Enter the  arraival time:");
		for(int a=0;a<n;a++) {
			 arr[a]=sc.nextInt();
		}
		System.out.println("Enter the  Departure time:");
		for(int b=0;b<n;b++) {
			 dep[b]=sc.nextInt();
		}
		for(int j=0;j<n-1;j++) {
			for(int k=0;k<n-j-1;k++) {
				if(arr[k]>arr[k+1]) {
					int temp =arr[k];
					 arr[k]=arr[k+1];
					 arr[k+1]=temp;
				}
			}
		}
		for(int j=0;j<n-1;j++) {
			for(int k=0;k<n-j-1;k++) {
				if(dep[k]>dep[k+1]) {
					int temp =dep[k];
					 dep[k]=dep[k+1];
					 dep[k+1]=temp;
				}
			}
		}
		int i=0;
		int j=0;
		int platform=0;
		int maxplatform=0;
		
		while(i<n && j<n) {
			if(arr[i]<dep[j]) {
				platform++;
				i++;
				if(platform>maxplatform) {
				maxplatform =platform;
				}
			}else if(arr[i] >dep[j]) {
				platform--;
				j++;
			}
		}
		System.out.println(maxplatform);
		
		

	}

}
