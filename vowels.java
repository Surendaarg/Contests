package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class vowels {

	public static void main(String[] args) {
		vowels o = new vowels();
		System.out.println(o.countVowelPermutation(2));
	}
	static HashMap<Integer, Set<Integer>> map;
public int countVowelPermutation(int n) {
	getValues();
	int num=1;
	PriorityQueue<Integer> q = new PriorityQueue<Integer>(); 
	while(num<=n){
		if(num==1)
		{
			for(Map.Entry<Long, Set<Integer>> m: map.entrySet()){
				q.add(m.getKey());
			}
		}
		if(num==2){
			PriorityQueue<Long> tmp = new PriorityQueue<Long>(); 
			while(q.isEmpty()){
				Long one = q.poll();
				tmp.add(map.get(one));
			}
		}
		if(num>1)
		{
			PriorityQueue<Long> tmp = new PriorityQueue<Long>(); 
			while(q.isEmpty()){
				Long one=q.poll();
				int reminder=one%10;
				
			}
			q=tmp;
		}
			num++;
	}
	System.out.println(q);
	return q.size();
    }
private void getValues() {
	map=new HashMap();
	Set<Integer> a = new HashSet<Integer>();
	a.add(2);
	Set<Integer> e = new HashSet<Integer>();
	e.add(1);
	e.add(3);
	Set<Integer> i = new HashSet<Integer>();
	i.add(1);
	i.add(2);
	i.add(4);
	i.add(5);
	Set<Integer> o = new HashSet<Integer>();
	o.add(3);
	o.add(5);
	Set<Integer> u = new HashSet<Integer>();
	u.add(1);
	map.put(1, a);
	map.put(2, e);
	map.put(3, i);
	map.put(4, o);
	map.put(5, u);
}
}
