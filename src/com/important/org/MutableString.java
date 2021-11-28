package com.important.org;

public class MutableString {
public static void main(String[] args) {
	String s="Testing";
	String s1="Testing";
	System.out.println("Immutable String");
	System.out.println(System.identityHashCode(s));
	System.out.println(System.identityHashCode(s1));
	String c = s.concat(s1);
	System.out.println(System.identityHashCode(c));
	
	System.out.println("Mutable String");
	StringBuffer sf=new StringBuffer("Testing");
	StringBuffer sf1=new StringBuffer("Testing");
	System.out.println(System.identityHashCode(sf));
	System.out.println(System.identityHashCode(sf1));
     StringBuffer a = sf.append(sf1);
	System.out.println(System.identityHashCode(a));
	
	
}
}
