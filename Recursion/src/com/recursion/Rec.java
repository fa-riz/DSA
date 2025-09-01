package com.recursion;

public class Rec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0;
		int n2=1;
		int c =5;
		System.out.println(n1);
		System.out.println(n2);
		getFib(n1,n2,c);

	}
	
	public static void getFib(int n1,int n2,int c) {
		if(c==0) {
			return;
		}
		System.out.println(n1+n2);
		getFib(n2, n1+n2, c-1);
	}

}
