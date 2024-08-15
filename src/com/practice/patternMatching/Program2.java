package com.practice.patternMatching;

import java.util.Scanner;

public class Program2 {

	static void pattern(int n) {
		for(int i=1;i<=n;i++) {                    // no.of.lines
			for(int j=1;j<=n;j++) {                // no.of.elements
				System.out.print(i%2+" ");
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
1 1 1 1 1 
0 0 0 0 0 
1 1 1 1 1 
0 0 0 0 0 
1 1 1 1 1 

*/