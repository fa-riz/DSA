package com.recursion;

public class ToReacjTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int mx = 4;
		int r = callFunc(n,mx);
		System.out.println(r);;
	}
	
	static int callFunc(int n,int mx) {
		return callHelp(n,mx,-1);
	}
	static int callHelp(int t,int mx,int c) {
		
		if(t==0) {
			return c;
		}
		
		if(mx>0&&t%2==0) {
			return callHelp(t/2,mx-1,++c);
		}
		else if(mx>0&&t%2!=0) {
			return callHelp(t-1,mx,++c);
		}
		else {
			return c+t;
		}
		
	}

}
