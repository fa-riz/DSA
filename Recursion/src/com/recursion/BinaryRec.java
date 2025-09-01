package com.recursion;

import java.util.Arrays;

public class BinaryRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = {34,12,6,89,65,31,21,12};
		Arrays.sort(ar);
		boolean ch = binaryRec(ar,0,ar.length-1,0);
		System.out.println(ch);
	}
	
	public static boolean binaryRec(int[] ar,int l,int h,int t) {
		
		if(l>h) {
			return false;
		}
		int mid = (l+h)/2;
		if(ar[mid]==t) {
			return true;
		}
		else if(ar[mid]<t) {
			return binaryRec(ar,mid+1,h,t);
		}
		else {
			return binaryRec(ar, l, mid-1, t);
		}
		
	}

}
