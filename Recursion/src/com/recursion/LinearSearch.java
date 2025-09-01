package com.recursion;

import java.util.ArrayList;


public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int[] ar = {1,2,57,8,2,3,1,2,35,6,9,0};
		ArrayList<Integer> arl = getSearch(ar,0,new ArrayList<Integer>(),2);
		ArrayList<Integer> arl1 = getSearch1(ar,0,2);
		System.out.println(arl1);
		System.out.println(arl);
	}
	
	static ArrayList<Integer> getSearch(int[] ar,int index,ArrayList<Integer> arl,int target) {
		
			if(index == ar.length) {
				return arl;
			}
			
			if(ar[index]==target) {
				arl.add(index+1);
			}
			
			return  getSearch(ar, index+1, arl, target);
	}
	static ArrayList<Integer> getSearch1(int[] ar,int index,int target) {
		ArrayList<Integer> arl = new ArrayList<>();
		
		if(index == ar.length) {
			return arl;
		}
		
		if(ar[index]==target) {
			arl.add(index+1);
		}
		
		ArrayList<Integer> list =  getSearch1(ar, index+1, target);
		arl.addAll(list);
		return arl;
}

}
