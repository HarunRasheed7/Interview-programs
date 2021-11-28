package com.String.org;

public class StringReverse {
public static void main(String[] args) {
	String s="welcome to java class";
	String rev="";
	String[] sp = s.split(" ");
	for (int i =sp.length-1; i>=0; i--) {
		String word=sp[i];
		rev=rev+word+" ";
		
	}
	System.out.println(rev);
	
}
}
