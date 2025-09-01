package DSA;
import java.util.*;

public class topK {
	
	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			int[] ar = new int[scan.nextInt()];
			
			for(int i=0;i<ar.length;i++) {
				ar[i]=scan.nextInt();
			}
			
			ArrayList<Integer> res = getKelemnts(ar);
	}
	
	     public static ArrayList<Integer> getKelemnts(int[] ar) {
	    	 
	    	 HashMap<Integer,Integer> data = new HashMap<>();
	    	 
	    	 for(int i=0;i<ar.length;i++) {
	    		 if(!data.containsKey(ar[i])) {
	    			 data.put(ar[i],1);
	    		 }
	    		 else {
	    			 data.put(ar[i],data.get(ar[i])+1);
	    		 }
	    	 }
	    	 System.out.println(data);
	    	 
	    	 return new ArrayList();
	     }

}
