package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MultiFold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiFold o = new MultiFold();
		int[] nums = {1,2};
		o.rotate(nums, 3);
		//System.out.println(o.subStrHash("xqgfatvtlwnnkxipmipcpqwbxihxblaplpfckvxtihonijhtezdnkjmmk", 22, 51, 41, 9));
	}

    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i:nums)
        	set.add(i);
        while(set.contains(original)){
        	original = original *2;
        }
        return original;
    }
    
    public List<Integer> maxScoreIndices(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        int one=0, zero=0, max=0;
        for(int i:nums){
        	if(i==1)
        		one++;
        }
        max = Math.max(one, nums.length-one);
        if(one==max)
        	res.add(0);
        for(int i=0; i<nums.length; i++){
        	if(nums[i]==1)
        		one--;
        	else
        		zero++;
        	if(one+zero>max){
        		max = one+zero;
        		res = new ArrayList<Integer>();
        	}
        	if(one+zero==max){
        		res.add(i+1);
        	}
        }
        return res;
    }
    
    public String subStrHash(String s, int power, int modulo, int k, int hashValue) {
        String res = new String();
        for(int i=0; i<=s.length()-k; i++){
        	res = s.substring(i, i+k);
        	long a, val=0;
        	for(int j=0; j<k; j++){
        		a =  res.charAt(j)+1-'a';
        		long p = (int)Math.pow(power, j)%modulo;
        		long mul = (long)(a*p);
        		val = (val+ mul)%modulo;
        	}
        	System.out.println(res+ " "+val+" ");
        	if(val%modulo==hashValue)
        		return res;
        }
        return res;
    }
    
    public void rotate(int[] nums, int k) {
        int n[] = new int[nums.length];
        k = k%nums.length;
    	for(int i=0; i<nums.length; i++){
    		n[i] = nums[i];
    	}
    	for(int i=0; i<nums.length; i++){
    		nums[i] = n[((nums.length-k)+i)%nums.length];
    	}
    	for(int i:nums)
    		System.out.print(i+" ");
    }
}
