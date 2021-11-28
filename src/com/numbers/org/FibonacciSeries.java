package com.numbers.org;

public class FibonacciSeries {
	public static void main(String[] args) {
		
	
int n=10;
int a=0,b=1,c=0;
for (int i = 1; i <=n; i++) {
	c=a+b;
	System.out.println(c);
	a=b;
	b=c;
	
}

}}
