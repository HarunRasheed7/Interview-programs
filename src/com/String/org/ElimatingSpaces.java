package com.String.org;

public class ElimatingSpaces {
	public static void main(String[] args) {
		String s="automation testing";
		char[] c = s.toCharArray();
		StringBuffer sf=new StringBuffer();
		for (int i = 0; i < c.length; i++) {
			 if ((c[i] != ' ') && (c[i] != '\t')) {  
	                sf.append(c[i]);  
	            }  
	        }  
		System.out.println(sf);
	}
	
}
