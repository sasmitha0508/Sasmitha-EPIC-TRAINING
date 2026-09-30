package javaCollections;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		HashMap<String,Integer>map=new HashMap<>();
		HashMap<Float,Integer>map1=new HashMap<>();
		HashMap<Character,Integer>map2=new HashMap<>();
		map.put("Apple", 100);
		map1.put(100.01f, 200);
		map2.put('S', 20);
		System.out.println(map);
		System.out.println(map1);
		System.out.println(map2);
	}

}
