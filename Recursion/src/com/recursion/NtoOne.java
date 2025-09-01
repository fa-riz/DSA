package com.recursion;

import java.util.Scanner;

public class NtoOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		printNtoOne(scan.nextInt());
		System.out.println();
		printOnetoN(5, 0);
	}
	
	static void printNtoOne(int n) {
		if(n<0) {
			return;
		}
		else {
			System.out.print(n + " ");
			printNtoOne(n-1);
		}
	}
	
	static void printOnetoN(int n,int c) {
		if(c==n) {
			return;
		}
		System.out.println(c);
		printOnetoN(n, c+1);
		
	}

}
