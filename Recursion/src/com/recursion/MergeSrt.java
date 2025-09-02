package com.recursion;

import java.util.Arrays;

public class MergeSrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] ar = {32,45,12,7,21,42,90,4,121};
			mergeSort(ar,0,ar.length-1);
			System.out.println(Arrays.toString(ar));
	}
	
	static void mergeSort(int[] ar,int l,int h) {
		
		int mid = l + (h-l)/2;
		int n1 = mid - l + 1;
	    int n2 = h - mid;
		int[] left = new int[n1];
		int[] right = new int[n2];
		
		if(mid < 1) {
			return;
		}
		
		for (int i = 0; i < left.length; i++) {
		    left[i] = ar[l + i];   // start from l
		}

		for (int j = 0; j < right.length; j++) {
		    right[j] = ar[mid + 1 + j];  // start from mid+1
		}
		
		System.out.println(Arrays.toString(left));
		mergeSort(left, 0, left.length-1);
		mergeSort(right, 0, right.length-1);
		System.out.println(Arrays.toString(right));
		merge(ar,left,right);
	}
	
	static void merge(int[] ar,int[] left,int[] right) {
	int i =0;
	int j=0;
	int k=0;
		while(i<left.length&&j<right.length) {
			if(left[i]<right[j]) {
				ar[k] = left[i];
				i++;
			}
			else {
				ar[k] = right[j];
				j++;
			}
			k++;
		}
		
		while(i<left.length) {
			ar[k] = left[i];
			i++;
			k++;
		}

		while(j<right.length) {
			ar[k] = right[j];
			j++;
			k++;
		}
	}
}
