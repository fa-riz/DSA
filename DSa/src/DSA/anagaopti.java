package DSA;
import java.util.*;
public class anagaopti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		String[] str = new String[scan.nextInt()];
		
		for(int i=0;i<str.length;i++) {
			str[i] = scan.next();
		}
		
		List<List<String>> li = getList(str);
		System.out.println(li);
scan.close();
	}
	
    public static List<List<String>> getList(String[] str) {
    	HashMap<String,List<String>> set = new HashMap<>();
    	if(str.length==0) {
    		return new ArrayList();
    	}
    	int[] bit = new int[26];
    	for(String s: str) {
    		Arrays.fill(bit,0);
    		for(char c:s.toCharArray()) {
    			bit[c-'a']++;
    		}
    	   StringBuilder sb = new StringBuilder("");
    	
    	for(int i:bit) {
    		sb.append(i);
    	}
    	String key = sb.toString();
    	if(!set.containsKey(key)) {
    		set.put(key,new ArrayList());
    	}
    		set.get(sb.toString()).add(s);
    }
    	System.out.println(set);
    	
    	return new ArrayList(set.values());
    }

}
