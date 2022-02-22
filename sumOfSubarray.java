package leetcode;

import java.util.Arrays;

public class sumOfSubarray {

	public static void main(String[] args) {
		sumOfSubarray o = new sumOfSubarray();
		int[] nums = {4,-2,-3,4,1};
		System.out.println(o.subArrayRanges(nums));
	}

    public long subArrayRanges(int[] nums) {
        long res = 0;
       // Arrays.sort(nums);
        
        for(int i=0; i<nums.length; i++){	
        	int max = nums[i], min = nums[i];
        	for(int j=i; j<nums.length; j++){
        		 max = Math.max(max, nums[j]);
                 min = Math.min(min, nums[j]);
        		res = res+max-min;
        		System.out.println("diff "+(max-min)+" res "+res+" j "+j+" j-c");
        	}
        }
        return res;
    }
}
