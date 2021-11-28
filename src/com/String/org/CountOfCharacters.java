package com.String.org;

public class CountOfCharacters {
	public static void main(String[] args) {
		
	
	String s="Harun99@GMail.com";
	String upp="",low="",digit="",spe="";
	int uppc=0,lowc=0,dc=0,spec=0;
	for (int i = 0; i <s.length(); i++) {
		char c = s.charAt(i);
		if (Character.isUpperCase(c)) {
			upp=upp+c;
			uppc=uppc+1;
			
		}else if (Character.isLowerCase(c)) {
			low=low+c;
			lowc=lowc+1;
			
		}else if (Character.isDigit(c)) {
			digit=digit+c;
			dc=dc+1;
			
		}else {
			spe=spe+c;
			spec=spec+1;
		}
		
	}
	System.out.println(upp);
	System.out.println(uppc);
	System.out.println(low);
	System.out.println(lowc);
	System.out.println(digit);
	System.out.println(dc);
	System.out.println(spe);
	System.out.println(spec);
	}
}
