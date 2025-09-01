package com.recursion;

public class CountZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 300002040;
		int r = numofZeroes(n,0);
		System.out.println(r);

	}
	
	static int numofZeroes(int n,int c) {
		if(n/10 == n ) {
		return c;
		}
		else if(n%10==0) {
			return numofZeroes(n/10,++c); 
		}
		else {
			return numofZeroes(n/10, c);
		}
	}

}
