package com.String.org;

public class ReverseEverySecondWord {
	public static void main(String[] args) {
		String s="welcome to java class";
		
		String[] even = s.split(" ");
		String result="";
		String f="";
		for (int i = 0; i < even.length; i++) {
			if (i%2==0) {
				System.out.print(" "+even[i]+" ");
				
			}else {
				result=even[i];
				for (int j = result.length()-1; j >=0; j--) {
					char c = result.charAt(j);
					f=""+c;
					System.out.print(f);
				}
				
			}
			
		}
	}
}
