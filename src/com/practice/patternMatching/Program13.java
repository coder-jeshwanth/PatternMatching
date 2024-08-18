package com.practice.patternMatching;

import java.util.Scanner;

public class Program13 {

	static void pattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
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
2 3 4 5 
3 4 5 
4 5 
5 

*/