package javaCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class DistinctElementHashSet {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer>li=new ArrayList<>();
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		System.out.println("Enter the elements of ArrayList:");
		for(int i=0;i<n;i++) {
			li.add(sc.nextInt());
		}// 10 20 10 20 30 40
		//30 40
		HashSet<Integer>dis=new HashSet<>();//10 20 30 40
		HashSet<Integer>dup=new HashSet<>();//10 20
		for(int x:li) {
			if(!dis.add(x)){
				dup.add(x);
			}
		}
		li.removeAll(dup);
		System.out.println(li);
        sc.close();
	}
}
            