package com.practice.patternMatching;

import java.util.Scanner;

public class Program14 {

	static void pattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=i;j>0;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nummber");
		int n = sc.nextInt();
		pattern(n);
	}
}


/*

Enter the nummber
5
1 
2 1 
3 2 1 
4 3 2 1 
5 4 3 2 1

*/