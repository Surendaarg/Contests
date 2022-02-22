package leetcode;

import java.util.ArrayList;
import java.util.HashMap;

import javax.naming.spi.DirStateFactory.Result;

public class longPalindrome {

	public static void main(String[] args) {
		longPalindrome o = new longPalindrome();
		String[] words = {"ab","ty","yt","lc","cl","ab","lc","cl","gg"};
		System.out.println(o.longestPalindrome(words ));
	}

    public int longestPalindrome(String[] words) {
    	 int res=0;
         HashMap<String, Integer> map = new HashMap<String, Integer>();
         for(String w:words){
         	int count=0;
         	if(map.containsKey(w))
         		count = map.get(w);
         	count++;
         	map.put(w, count);
         }
       //  System.out.println(map);
         boolean sameLetter =false;
         for(String w:words){
         	StringBuffer rev = new StringBuffer();
         	rev.append(w);
         	
         	if(map.containsKey(w) && map.containsKey(rev.reverse().toString())){
         		if(map.get(w)>0 && map.get(rev.toString())>0 && (!w.equals(rev.toString()))){
         			res=res+4;
         			map.put(w, map.get(w)-1);
         			map.put(rev.toString(), map.get(rev.toString())-1);
                     // System.out.println(map);
         			//System.out.println("rev "+w+" "+rev);
         		}
                 else if((w.equals(rev.toString())) && map.get(w)>1){
                     res=res+4;
                     map.put(w, map.get(w)-2);
                 }
         		else if(!sameLetter){
         			if(w.equals(rev.toString()) && map.get(w)>0)
         			{
         				res = res+2;
         				sameLetter = true;
                       //  System.out.println("same :"+w+" "+rev);
                       //   System.out.println(map);
         			}
         		}
         	}
         }
         return res;
    }
}
