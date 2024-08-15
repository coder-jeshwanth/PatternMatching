package com.practice.patternMatching;

import java.util.Scanner;

public class Program4 {

	static void pattern(int n) {
		for(int i=n;i>0;i--) {
			for(int j=1;j<=n;j++) {
				System.out.print(i+" ");
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
