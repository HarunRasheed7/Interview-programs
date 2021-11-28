package com.String.org;

public class VowelCount {
	public static void main(String[] args) {
		String s="Automation";
		String vowel="",con="";
		int vc=0,cc=0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				vowel=vowel+c;
				vc=vc+1;
				
			}else {
				con=con+c;
				cc=cc+1;
			}
		}
		System.out.println(vowel);
		System.out.println(vc);
		System.out.println(con);
		System.out.println(cc);
		
	}

}
