package com.practice.patternMatching;

import java.util.Scanner;

public class Program3 {

	static void pattern(int n ) { 
		for(int i=1;i<=n;i++) {                     // no.of.lines
			for(int j=n;j>0;j--) {                  // no.of.elements
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

/*

Enter the number
5
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1

*/