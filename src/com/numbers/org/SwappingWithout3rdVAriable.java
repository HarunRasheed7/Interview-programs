package com.numbers.org;

public class SwappingWithout3rdVAriable {
public static void main(String[] args) {
	int a=20;
	int b=40;
	
	a=a+b;
	b=a-b;
	a=a-b;
	
	System.out.println(a);
	System.out.println(b);
}
}
