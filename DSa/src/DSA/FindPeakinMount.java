package DSA;

public class FindPeakinMount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int ar[] = {7,8,9,12,16,17,18,21,5,4,3,2,1,0};
			int res = findPeak(ar);
			System.out.println(res);
	}
	
	public static int findPeak(int[] ar) {
		
		int l=0;
		int h=ar.length-1;
		int mid = (h+l)/2;
		while(h!=mid&&l!=mid) {
			if(ar[mid] < ar[mid+1]) {
				l=mid;
			}
			else {
				h=mid;
			}
			mid = (l+h)/2;
		}
		if(l==mid) {
			return ar[h];
		}
		else {
			return ar[l];
		}
	}
	
	

}
