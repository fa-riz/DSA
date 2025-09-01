package com.recursion;

public class RotaBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static boolean binaryRot(int[] ar,int t) {
		
			int l = 0;
			int h = ar.length-1;
			while(l<=h) {
					
				int mid = l + (h-l)/2;
				if(ar[mid]==t) {
					return true;
				}
				else if(ar[l]<ar[mid] && t < ar[mid]) {
						
					h = mid-1;
				}
				else if(t <= ar[mid] && t >= ar[l]) {
					l = mid +1;
				}
				else {
					
				}
				
					
			}
		return false;
	}

}
