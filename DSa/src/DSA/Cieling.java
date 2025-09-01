package DSA;

import java.util.Scanner;

public class Cieling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
//		int[] ar = new int[scan.nextInt()];
//		for(int i=0;i<ar.length;i++) {
//			ar[i] = scan.nextInt();
//		}
		int ar[] = {2,3,5,9,14,16,18};
		System.out.println("Enter trget");
		int target = scan.nextInt();
		int result = checkCieling(ar,target);
		System.out.println("The ciel " + result);

	}

	   public static int checkCieling(int[] ar,int t) {
		   
		   int mid = 0;
		   int h = ar.length;
		   int l = 0;
		   
		   while(l<=h) {
			   
			   	mid = (l+h)/2;
			   	System.out.println(mid);
			   	if(ar[mid] == t) {
			   		return ar[mid];
			   	}
			   	else if(ar[mid]<t) {
			   		l=mid+1;
			   	}
			   	else {
			   		h=mid-1;
			   	}
		   }
		   
		   return ar[l];
		   
	   }
}
