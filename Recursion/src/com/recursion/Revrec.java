package com.recursion;

import java.util.Scanner;

public class Revrec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan  = new Scanner(System.in);
		int n = scan.nextInt();
		 getRev(n);
		System.out.println(sum);
	}
	static int sum = 0;
	static void getRev(int n) {
		
		if(n==0) {
			return ;
		}
		int r = n%10;
		sum = sum * 10 + r;
		 getRev(n/10);
	}

}
