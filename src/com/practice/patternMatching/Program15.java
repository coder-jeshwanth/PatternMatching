package com.practice.patternMatching;

import java.util.Scanner;

public class Program15 {

	static void pattern(int n) {
		for(int i=n;i>0;i--) {
			for(int j=i;j>0;j--) {
				System.out.print(j+" ");
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
