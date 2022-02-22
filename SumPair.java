package leetcode;

import java.util.HashMap;

public class SumPair {

	public static void main(String[] args) {
		int arr[] = {2,7,11,15};
		SumPair o = new SumPair();
		int res[] = o.twoSum(arr, 13);
		System.out.println(res[0]+" "+res[1]);
	}

public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
        	if(mp.containsKey(target-nums[i])){
        		res[0]=mp.get(target-nums[i]);
        		res[1]=i;
        		return res;
        	}
        	mp.put(nums[i],i);
        }
        return res;
    }
}
