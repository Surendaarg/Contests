package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;

public class Repeat {

	public static void main(String[] args) {
		Repeat o = new Repeat();
		int[] nums = {3,1,2,2,2,1,3};
		//System.out.println(o.countPairs(nums , 2));
		long[] res  = o.sumOfThree(33);
		int[] nums1 = {2,0,1,3};
		int[] nums2 = {0,1,2,3};
		//for(long i:res)
			//System.out.print(i+" ");
		//System.out.println(o.maximumEvenSplit(12));
		//System.out.println(o.goodTriplets(nums1 , nums2));
		//System.out.println(o.countEven(38));
		System.out.println(o.repeatLimitedString("aababab", 2));
	}
	
    public String repeatLimitedString(String s, int repeatLimit) {
        PriorityQueue<Character> pq = new PriorityQueue<Character>((a,b)->b-a);
        for(char ch:s.toCharArray()){
        	pq.add(ch);
        }
        StringBuffer res = new StringBuffer();
        ArrayList<Character> list = new ArrayList<Character>();
        Stack<Character> stk = new Stack<Character>();
        int count = 0;
        char previouschar = pq.peek();
        while(!pq.isEmpty()){
        	char curr = pq.poll();
        	if(curr==previouschar){
        		if(count<repeatLimit){
        			res.append(curr);
        		}
        		else{
        			stk.add(curr);
        		}
        		count++;
        	}
        	else{
        		if(stk.isEmpty()){
        			count=0;
        			res.append(curr);
        			previouschar = curr;
        			count++;
        		}
        		else{
        			res.append(curr);
        			count=0;
        			while(!stk.isEmpty() && count<repeatLimit){
        				res.append(stk.pop());
        				count++;
        			}
        		}
        	}
        }
        return res.toString();
    }
	

    public int countEven(int num) {
        int res=0;
        int i=2;
        while(i<=num){
        	int n = i;
        	int sum=0;
        	while(n>0){
        		sum = sum + n%10;
        		n= n/10;
        	}
        	if(sum%2==0){
        		System.out.println(i);
        		res++;
        	}
        	i++;
        }
        return res;
    }
	
	public long goodTriplets(int[] nums1, int[] nums2) {
        long res = 0;
        HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> map2 = new HashMap<Integer, Integer>();
        int len = nums1.length;
        for(int i=0; i<len; i++){
        	map1.put(nums1[i], i);
        }
        for(int i=0; i<len; i++){
        	map2.put(nums2[i], i);
        }
        return res;
    }
	
	public List<Long> maximumEvenSplit(long finalSum) {
		List<Long> res = new ArrayList<Long>();
		if(finalSum%2==1)
			return res;
		Long num = (long) 2;
		while(finalSum>0){
			if(num>finalSum/2)
				num = finalSum;
			finalSum = finalSum - num;
			res.add(num);
			if(num+2<finalSum/2)
				num = num+2;
			else
				num = finalSum;
		}
		return res;
    }

	public long[] sumOfThree(long num) {
        if(num%3!=0)
        	return new long[0];
        long[] res = new long[3];
        res[0] = num/3 - 1;
        res[1] = num/3;
        res[2] = num/3 + 1;
		return res;
        
    }
    public int countPairs(int[] nums, int k) {
        int len = nums.length;
        if(len<=1)
        	return 0;
        int res = 0;
        for(int i=0; i<len; i++){
        	int one = nums[i];
        	for(int j=i+1; j<len; j++){
        		int two = nums[j];
        		if(one==two){
        			if(i*j%k==0)
        				res++;
        		}
        	}
        }
        return res;
    }
}
