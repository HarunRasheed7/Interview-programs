package com.String.org;

public class FirstLetterCaps {
public static void main(String[] args) {
	String s="welcome to java class";
	String cap="";
	String[] sp = s.split(" ");
	for (int i = 0; i < sp.length; i++) {
		String word=sp[i];
		char c = word.charAt(0);
		String sub = word.substring(1);
		cap=cap+Character.toUpperCase(c)+sub+" ";
	}
	System.out.println(cap);
}
}
