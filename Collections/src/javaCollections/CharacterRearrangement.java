package javaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//Important
public class CharacterRearrangement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Ente the string:");
		String str=sc.nextLine();
		String emp="";
		ArrayList<Character>alp=new ArrayList<>();
		ArrayList<Character>num=new ArrayList<>();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='a'&&ch<='z'|| ch>='A'&& ch<='Z') {
				alp.add(ch);
			}
			if(ch>='0'&&ch<='9'){
				num.add(ch);
			}
		}
		Collections.reverse(alp);
		Collections.sort(num);
		System.out.println(alp);
		System.out.println(num);
		int inda=0;
		int indn=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='a'&&ch<='z'|| ch>='A'&& ch<='Z') {
				emp+=alp.get(inda);
				inda++;
			}
			else if(ch>='0'&&ch<='9'){
				emp+=num.get(indn);
				indn++;
			}
			else {
				emp+=ch;
			}
		}
		System.out.println(emp);
	}

}
