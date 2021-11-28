package com.numbers.org;

public class ReversingNumber {
	public static void main(String[] args) {
		

	int n=12345;
	int i=0,j=0,a=0;
	
	a=n;
	while(a>0) {
		i=a%10;
		j=(j*10)+i;
		a=a/10;
		
		
	}
	System.out.println(j);
}
}