package DSA;

import java.util.Arrays;
import java.util.Scanner;

public class StringCiel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
//		int[] ar = new int[scan.nextInt()];
//		for(int i=0;i<ar.length;i++) {
//			ar[i] = scan.nextInt();
//		}
		char ar[] = {'c','b','g','y','q'};
		Arrays.sort(ar);
		System.out.println("Enter trget");
		char target = scan.next().charAt(0);
		System.out.println(Arrays.toString(ar));
		char result = checkCieling(ar,target);
		System.out.println("The ciel " + result);

	}

	   public static char checkCieling(char[] ar,int t) {
		   
		   int mid = 0;
		   int h = ar.length-1;
		   int l = 0;
		   	mid = (l+h)/2;

		   while(l<=h) {
			   
//			   	if(ar[mid] == t) {
//			   		return ar[mid];
//			   	}
			   	 if(ar[mid]<=t) {
			   		l=mid+1;
			   	}
			   	else {
			   		h=mid-1;
			   	}
				   	mid = l+h/2;
				   	System.out.println(l +" "+mid+" "+h);

		   }
		   if(l>=ar.length)
		   return ar[l%ar.length];
		   else
			   return ar[l];
		   
	   }
}
