package com.String.org;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicToolBarUI.DockingListener;

public class  Practice {
	
	public static void main(String[] args) {
		String a="java1";
		String b="hello";
		
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < a.length()||i<b.length(); i++) {
			if (i<a.length()) {
				sb.append(a.charAt(i));
				if (i<b.length()) {
					sb.append(b.charAt(i));
				}
			}
			
			
		}
		System.out.println(sb);
		
		
		}
		
		
	}
	
	
	
		
	
	


