package com.String.org;

public class ReverseSentence {
public static void main(String[] args) {
	String s="Welcome to java class";
	String rev="";
	String[] sp = s.split(" ");
	for (int i = 0; i < sp.length; i++) {
		String word=sp[i];
		String n="";
		for (int j = word.length()-1; j >=0; j--) {
			char c = word.charAt(j);
			n=n+c;
			}
		rev=rev+n+" ";
	}
	System.out.println(rev);
}
}
