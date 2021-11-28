package com.String.org;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
public static void main(String[] args) {
	String s="automation";
	char[] c = s.toCharArray();
	Map<Character,Integer> mp=new HashMap<>();
	for (char d : c) {
		if (mp.containsKey(d)) {
			Integer i = mp.get(d);
			mp.put(d,i+1);
			
			
		}else {
			mp.put(d,1);
		}
	}
	System.out.println(mp);
	for(Map.Entry mm:mp.entrySet()) {
		int value = (int) mm.getValue();
		if (value>1) {
			
		
		System.out.println(mm.getKey());
	}
}
}
}
