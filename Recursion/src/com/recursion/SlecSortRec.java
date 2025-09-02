package com.recursion;

import java.util.Arrays;

public class SlecSortRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {2,4,1,9,5,80};
		selectionSort(ar,0,0,0);
		System.out.println(Arrays.toString(ar));
	}
	
	static void selectionSort(int[] ar,int i,int j,int min) {
		
		if(i>=ar.length) {
			return;
		}
		if(j<ar.length) {
			if(ar[j]<ar[min]) {
				min = j;
				selectionSort(ar, i, j+1, min);
			}
			else {
				selectionSort(ar, i, j+1, min);
			}
		}
		else {
			swap(ar,i,min);
			selectionSort(ar, i+1, i+1, i+1);
			
		}
			
	}
	static void swap(int[] ar,int i,int j) {
		
		int temp;
		temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
		
	}
}
