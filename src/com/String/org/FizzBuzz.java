package com.String.org;

public class FizzBuzz {
	public static void main(String[] args) {
		int limit=100;
		for (int i = 0; i < 100; i++) {
			if (i%15==0) {
				System.out.println("fizzbizz");
				
			}else if (i%5==0) {
				System.out.println("Buzz");
				
			}else if (i%3==0) {
				System.out.println("fizz");
				
			}else {
				System.out.println(i);
			}
			
		}
			
		
		
		
		}
}
