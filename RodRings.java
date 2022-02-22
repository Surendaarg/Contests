package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RodRings {

	public static void main(String[] args) {
		RodRings o = new RodRings();
		System.out.println(o.countPoints("B0R0G0R9R0B0G0"));
	}

    public int countPoints(String rings) {
        HashMap<Integer, Set<Character>> map = new HashMap();
        for(int i=0; i<rings.length(); i=i+2){
        	char a = rings.charAt(i);
        	int b = rings.charAt(i+1)-'0';
        	Set<Character> s = new HashSet<Character>();
        	if(map.containsKey(b)){
        		s = map.get(b);
        	}
        	s.add(a);
        	map.put(b, s);
        }
        int count=0;
        for(Map.Entry<Integer, Set<Character>> e:map.entrySet()){
        	if(e.getValue().size()==3)
        		count++;
        }
        return count;
    }
}
