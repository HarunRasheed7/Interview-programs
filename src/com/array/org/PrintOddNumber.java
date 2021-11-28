package com.array.org;

public class PrintOddNumber {
	public static void main(String[] args) {
		int a[]= {2,1,44,22,3,66,4,7,9};
		for (int i = 0; i < a.length; i++) {
			if (a[i]%2!=0) {
				System.out.println(a[i]);
				
			}
		}
	}
}
