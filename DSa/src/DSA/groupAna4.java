package DSA;

import java.util.*;
public class groupAna4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] ar = {"tea","eat","tan","ate","bat"};
		ArrayList<String> res = new ArrayList<>();
		
		
		for(String n: ar) {
			char ar1[] = n.toCharArray() ;
			Arrays.sort(ar1);
			String s = new String(ar1);
			res.add(s);
		}
		System.out.println(res);
		Collections.sort(res);
		System.out.println(res);

	}

}
