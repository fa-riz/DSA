package com.recursion;

public class RecuPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			pattern(5,0);
	}
	
	static void pattern(int r,int c) {
		if(r<=0) {
			return;
		}
		if(r>c) {
			System.out.print("* ");
			pattern(r, c+1);
		}
		else {
			System.out.println();
			pattern(r-1, 0);
		}
	}

}

/*
 * For to print upside down triangle just interchange sysout and func call 
 * */
