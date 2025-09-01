package com.recursion;

public class IfArrrayisSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = {1,2,3,4,5,6,7,8,9,10};
		boolean res = checkif(ar,0,1);
		System.out.println(res);
	}
	
	static boolean checkif(int[] ar,int i,int j) {
		
		if(j>ar.length-1) {
			return true;
		}
		
		if(ar[i]<=ar[j]) {
			return true && checkif(ar,i+1,j+1);
		}
		else {
			return false;
		}
	}

}
