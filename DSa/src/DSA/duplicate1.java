package DSA;

import java.util.*;

public class duplicate1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the limit of array");
		int[] ar = new int[scan.nextInt()];
		for(int i=0;i<ar.length;i++)
			ar[i] = scan.nextInt();
		System.out.println(Arrays.toString(ar));
		boolean k = checkForDup(ar);
		System.out.println(k);
	}
	
	public static  boolean checkForDup(int[] ar) {
		Set<Integer> n = new HashSet<>();
		
		for(int l:ar) {
			if(n.contains(l)) {
				return true;
			}
			else {
				n.add(l);
			}
		}
		
		
		
		return false;
	}

}
