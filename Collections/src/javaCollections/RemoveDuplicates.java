package javaCollections;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of ArrayList:");
		int n=sc.nextInt();
		System.out.println("Enter the elements of ArrayList:");
		ArrayList<Integer>li=new ArrayList<>();
		for(int i=0;i<n;i++) {
			li.add(sc.nextInt());
		}
		for(int i=0;i<n;i++) {
			if(li.contains(li.get(i)) && li.indexOf(li.get(i))!=i){
				li.remove(i);
				n--;
			}
			else {
				i++;
			}
		}
		System.out.println(li);
	}

}
