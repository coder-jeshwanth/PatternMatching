package com.practice.patternMatching;

import java.util.Scanner;

public class Program9 {

	static void pattern(int n) {
		int k=65;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print((char)k + " ");
				k++;
				if(k==91)
					k=65;
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
6
A B C D E F 
G H I J K L 
M N O P Q R 
S T U V W X 
Y Z A B C D 
E F G H I J 

*/