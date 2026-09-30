package javaCollections;

import java.util.ArrayList;

public class Flames {

	public static void main(String[] args) {
		String str1="Sasmitha";
		String str2="Sudhar";
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		ArrayList<Character>s1=new ArrayList<>();
		ArrayList<Character>s2=new ArrayList<>();
		for(char x:str1.toCharArray()) {
			s1.add(x);
		}
		for(char x:str2.toCharArray()) {
			s2.add(x);
		}
		for(int i=0;i<s1.size();i++) {
			if(s2.contains(s1.get(i))) {
				s2.remove((Character)s1.get(i));
				s1.remove((Character)s1.get(i));
				i--;
			}
		}
			int count=s1.size()+s2.size();
			String res="FLAMES";
			ArrayList<Character>r=new ArrayList<>();
			for(char ch:res.toCharArray()) {
				r.add(ch);
			}
			int index=0;
			while(r.size()>1) {
				index=(index+count-1)%r.size();
				r.remove(index);
			}
			System.out.println(r.get(0));
		}
	}	

