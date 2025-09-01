package DSA;
import java.util.Arrays;
import java.util.Scanner;
public class PeakndexinMount {

	public static void main(String[] args) {

				// TODO Auto-generated method stub
				Scanner scan = new Scanner(System.in);
				int[] ar = {1,3,6,8,12,16,19,20,21,33,67,89,123};
				Arrays.sort(ar);
				int l=0,h=1;
				int t = scan.nextInt();
				boolean check = false;
				while(true) {
					try {
				 check = binary(ar,t,l,h);
					}
					catch (Exception e) {
						System.out.println("not found");
						break;
					}
				if (check) {
					System.out.println("found");
					break;
				}
				else {
					l=h;
					h=h*2;
				}
				}

			}
			
			public static boolean binary(int[] ar,int t,int l, int h) {
				 
				   int mid = 0;
				 
				   
				   while(l<=h) {
					   
					   	mid = (l+h)/2;
					   	
					   	if(ar[mid] == t) {
					   		return true;
					   	}
					   	else if(ar[mid]<t) {
					   		l=mid+1;
					   	}
					   	else {
					   		h=mid-1;
					   	}
				   }
				   
				   return false;
				   
			}
	}

