package javaCollections;

import java.util.HashMap;

public class OccurenceOfCharacter {

	public static void main(String[] args) {
		String  str="hello";
		HashMap<Character,Integer>map=new HashMap<>();
//		for(char ch:str.toCharArray()) {
//			map.put(ch,map.getOrDefault(ch, 0)+1);
//		}
		for(char ch:str.toCharArray()) {
			int count=1
					;
			if(map.containsKey(ch)) {
				count+=1;
				map.put(ch, count);
			}
			else {
				map.put(ch, count);
			}
		}
		
		System.out.println(map);
	}

}
