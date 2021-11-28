package com.String.org;

import java.util.HashMap;
import java.util.Map;

public class StringCount {
	public static void main(String[] args) {
	String s="Chennai to Chennai";
	String[] sp = s.split(" ");
	Map<String,Integer> mp=new HashMap<>();
	for (String d : sp) {
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
