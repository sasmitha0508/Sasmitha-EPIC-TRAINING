package string;

import java.util.Scanner;

public class Contains_Substring {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str1 = in.nextLine();
		System.out.println("Enter anothere string:");
		String str2 = in.nextLine();
        String emp="";
        boolean found=false;
		for(int i=0;i<=(str1.length()-str2.length());i++) {
			for(int j=i;j<(str2.length()+i);j++) {
				emp+=str1.charAt(j);
				if(emp.equals(str2)) {
					found=true;
					break;
				}
			}
			
		}
		if(true) {
			System.out.println("It is substring");
			}
	}

}
