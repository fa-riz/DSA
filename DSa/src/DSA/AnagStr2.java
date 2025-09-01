package DSA;
import java.util.*;
public class AnagStr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two strings");
		String s = scan.next();
		String t = scan.next();
		
		boolean k = checkAnagram(s.toLowerCase(),t.toLowerCase());
		System.out.println(k);
		

	}
	
	public static boolean checkAnagram(String s, String t) {
		
	if(s.length() != t.length()) {
		return false;
	}
	  char[] s1 = s.toCharArray();
	  char[] t1 = t.toCharArray();
	  
	  int[] n = new int[26];
	  for(int i=0;i<s1.length;i++) {
		  int x = (int)s1[i]-97;
		  n[x] = n[x]+1;
		  int y = (int)t1[i]-97;
		  n[y] = n[y]-1;
	  }
System.out.println(Arrays.toString(n));
	  for(int p:n) {
		  if(p!=0) {
			  return false;
		  }
	  }
	  return true;
	}

}
