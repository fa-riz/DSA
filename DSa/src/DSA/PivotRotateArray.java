package DSA;

public class PivotRotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = {10,12,14,15,19,8,7,9};
		int pivot = checkPivot(ar);
		System.out.println(pivot);

	}
	
	public static int checkPivot(int[] ar) {
		
		int l = 0;
		int h = ar.length-1;
		int m = (l+(h-l))/2;
		while(l<=h) {
			if(ar[l] < ar[m]) {
				l = m+1;
			}
			else {
				h = m-1;
			}
			
			 m = (l+(h-l))/2;

		}
		return ar[l];
	}

}
