package com.practice.patternMatching;

import java.util.Scanner;

public class Program8 {

	static void pattern(int n) {
		int k=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(k+" ");
				k++;
				if(k==10)
				k=1;
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
6 7 8 9 1 
2 3 4 5 6 
7 8 9 1 2 
3 4 5 6 7 

*/