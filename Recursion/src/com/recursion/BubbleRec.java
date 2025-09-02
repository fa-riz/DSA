package com.recursion;

import java.util.Arrays;

public class BubbleRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = {5,8,3,1,8,7,2,0};
		bubbleRec(ar,ar.length-1,0);
		System.out.println(Arrays.toString(ar));

	}
	
	static void bubbleRec(int[] ar,int i,int j) {
		        if (i == 0) {
		            return;
		        }

		        // Inner loop condition
		        if (j < i) {
		            if (ar[j] > ar[j + 1]) {
		                swap(ar, j, j + 1);
		            }
		            bubbleRec(ar, i, j + 1); // Continue inner loop
		        } else {
		            bubbleRec(ar, i - 1, 0); // Move to next outer pass
		        }
		    }
	
	static void swap(int[] ar,int i,int j) {
			
		int temp;
		temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
		
	}

}
