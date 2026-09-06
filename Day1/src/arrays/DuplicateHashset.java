package arrays;

import java.util.HashSet;
import java.util.Scanner;

public class DuplicateHashset {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int arr[] = new int[n];
		
		for(int i =0;i<n ; i++) {
			arr[i]= s.nextInt();
		}
		
		HashSet<Integer> a = new HashSet<>();
		HashSet<Integer> b = new HashSet<>();
		
		for(int x:arr) {
			if(!a.add(x) && b.add(x)) {
				System.out.println(x);
				
			}
		}
	}
}
