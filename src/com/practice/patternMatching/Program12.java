package com.practice.patternMatching;

import java.util.Scanner;

public class Program12 {

	static void pattern(int n) {
		for(int i=n;i>0;i--) {
			for(int j=1;j<=i;j++) {
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
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 

*/