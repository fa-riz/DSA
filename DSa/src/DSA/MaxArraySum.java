package DSA;

import java.util.Scanner;

public class MaxArraySum {
	
	public static void main(String[] args) {
		
		int[] ar = {3,6,4,21,8,5,9};
		Scanner scan = new Scanner(System.in);
		int m  = scan.nextInt();
		
		int res = checkArray(ar,m);
		System.out.println(ar);
	}
	
	public static int checkArray(int[] ar,int m) {
		if(m==1) {
			return sumArray(ar, 0, ar.length);
		}
		else if(m==ar.length) {
			
		}
		return 1;
	}
	public static int sumArray(int[] ar,int l,int h) {
		int sum = 0;
		for(int i=l;i<h;i++) {
			sum = sum+ar[i];	               
		}
		
		return sum;
	}
}
