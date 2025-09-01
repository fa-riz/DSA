package com.recursion;

import java.util.Scanner;

public class SumofDigRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int sum = sumofDig(n);
		System.out.println(sum);
	}
	static int sumofDig(int n) {
		if(n<=0) {
			return 0;
		}
			int r = n%10;
			return r + sumofDig(n/10);
	}
}
