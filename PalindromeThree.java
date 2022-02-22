package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PalindromeThree {

	public static void main(String[] args) {
		PalindromeThree o = new PalindromeThree();
		o.countPalindromicSubsequence("aabca");
	}

public int countPalindromicSubsequence(String s) {
        int alpha[] = new int[26];
        int count=0;
        if(s.length()<=2)
        	return 0;
        HashMap<Character, LinkedList<Integer>> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
        	alpha[s.charAt(i)-'a']++;
        	LinkedList<Integer> list;
        	if(map.containsKey(s.charAt(i)))
        		list=map.get(s.charAt(i));
        	else
        		list=new LinkedList<Integer>();
        	list.add(i);
        	map.put(s.charAt(i), list);
        }
        System.out.println(map);
        Set<String> set = new HashSet<String>();
        for(Map.Entry<Character, LinkedList<Integer>> e:map.entrySet()){
        	if(e.getValue().size()>=2){
        		LinkedList<Integer> list=e.getValue();
        		int arr[] = new int[e.getValue().size()];
        		int i=0;
        		for(Integer a:list){
        			arr[i]=a;
        			i++;
        		}
        		int min=arr[0], max=arr[--i];
        			for(int j=min+1; j<max; j++){
        			String str=e.getKey()+""+s.charAt(j)+""+e.getKey();
        			if(str.length()==3)
        				set.add(str);
        		}
        		}
        }
        
        System.out.println(set);
        return set.size();
}
}