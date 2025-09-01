package DSA;

import java.util.*;


public class Twosum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int[] ar = new int[scan.nextInt()];
		for(int i=0;i<ar.length;i++) {
			ar[i] = scan.nextInt();
		}
		System.out.println("Enter the element: "); 
		int q = scan.nextInt();
		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));
		
		ArrayList<Integer> res = twoSum(ar,q);
		System.out.println(res);
 
	}
	
	public static ArrayList<Integer> twoSum(int[] ar,int c) {
		
		  HashMap<Integer, Integer> checkTS = new HashMap<>();
		  ArrayList<Integer> res = new ArrayList<>();
		  for(int i=0;i<ar.length;i++) {
			  if(ar[i]>c) {
				  continue;
			  }
			  if(!checkTS.containsKey(ar[i])) {
				  checkTS.put(ar[i],i);
			  }
			  int x = c-ar[i];
			  if(checkTS.containsValue(x)) {
				  res.add(i);
				  res.add(checkTS.get(x));
			  }
		  
		  }
		  return res;
		  
	}

}
