package com.practice.patternMatching;

import java.util.Scanner;

public class Program5 {

	static void pattern(int n ) {
		for(int i=1;i<=n;i++) {                       // no.of.lines
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

/*

Enter the number
5
2 6 12 20 30 

*/