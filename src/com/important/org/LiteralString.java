package com.important.org;

public class LiteralString {
	public static void main(String[] args) {
		String s=new String("Harun");
		String s1=new String ("Harun");
		System.out.println(s.equals(s1));
		System.out.println(s==s1);
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		String x="Harun";
		String x1="Harun";
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(x1));
	}

}
