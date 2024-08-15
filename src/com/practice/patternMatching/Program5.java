package com.practice.patternMatching;

import java.util.Scanner;

public class Program5 {

	static void pattern(int n ) {
		for(int i=1;i<=n;i++) {
			System.out.print(i*(i+1)+" ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		pattern(n);
	}
}
