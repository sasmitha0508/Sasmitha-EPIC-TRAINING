package problems;

import java.util.Scanner;

public class Merge2arrays {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
    System.out.println("Enter the size of  1st array:");
    int n1=s.nextInt();
    
    int a1[] =new int[n1];
    System.out.println("Enter elemnts of array:");
    for(int i=0;i<n1;i++) {
    	a1[i]=s.nextInt();
    }
    
    System.out.println("Enter the size of  2nd array:");
    int n2=s.nextInt();
    
    int a2[] =new int[n2];
    System.out.println("Enter elemnts of array:");
    for(int i=0;i<n2;i++) {
    	a2[i]=s.nextInt();
    }
    int a3[] =new int[n1+n2];
    
    for(int i=0;i<n1;i++) {
    	a3[i]=a1[i];
    }
    for(int i=0;i<n2;i++) {
    	a3[n1+i]=a2[i];
    }
    
    for(int i=0;i<a3.length;i++) {
    	System.out.println(a3[i]);
    }
    s.close();
}
}
