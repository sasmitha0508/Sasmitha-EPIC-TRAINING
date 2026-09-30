package javaCollections;

import java.util.ArrayList;
import java.util.Scanner;

public class FindSecondLargestElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of ArrayList:");
		int n=sc.nextInt();
		System.out.println("Enter the elements of ArrayList:");
		ArrayList<Integer>li=new ArrayList<>();
		for(int i=0;i<n;i++) {
			li.add(sc.nextInt());
		}
		int max=Integer.MIN_VALUE;
		int sec_max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(li.get(i)>max) {
				sec_max=max;
				max=li.get(i);
			}
			else if(li.get(i)>sec_max && li.get(i)<max) {
				sec_max=li.get(i);
			}
		}
		if(sec_max==Integer.MIN_VALUE) {
			System.out.println("All elements are same");
		}else {
			System.out.println("The Second largest element:"+sec_max);
		}
	}

}
