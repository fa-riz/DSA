package com.recursion;

import java.util.Scanner;

public class Factrec {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner scan = new Scanner(System.in);
		
		long k = getFact(scan.nextInt());
		System.out.println(k);
	}
	
	static long getFact(int n) {
		if(n==1) {
			return 1;
		}
		return n*getFact(n-1);
	}

}
