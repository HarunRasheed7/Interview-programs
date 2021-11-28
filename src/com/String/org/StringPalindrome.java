package com.String.org;

public class StringPalindrome {
	public static void main(String[] args) {
		

	String s ="yes";
	
	String rev="";
	for (int i =s.length()-1; i >=0; i--) {
		char c = s.charAt(i);
		rev=rev+c;
		
	}
	System.out.println(rev);
	if (rev.equals(s)) {
		System.out.println("palindrome");
		
	}else {
		System.out.println("Not a palindrome");
	}
}
}
