package com.practice.patternMatching;

import java.util.Scanner;

public class Program4 {

	static void pattern(int n) {
		for(int i=n;i>0;i--) {                    // no.of.lines
			for(int j=1;j<=n;j++) {               // no.of.elements
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

/*

Enter the number
5
5 5 5 5 5 
4 4 4 4 4 
3 3 3 3 3 
2 2 2 2 2 
1 1 1 1 1

*/