package com.practice.patternMatching;

import java.util.Scanner;

public class Program1 {

	static void pattern(int n) {
		for(int i=1;i<=n;i++) {               // no.of.lines
			for(int j=1;j<=n;j++) {           // no.of.elements
				System.out.print(j%2 + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		pattern(n);
	}
}
