package leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

public class sumOfThree {

	public static void main(String[] args) {
	int nums[]={-1,2,1,-4};
	sumOfThree o = new sumOfThree();
	System.out.println(o.threeSumClosest(nums,1));
	}

private int threeSumClosest(int[] nums, int target) {
	if(nums.length < 3) return -1;
    Arrays.sort(nums);
    int sum = nums[0] + nums[1] + nums[2];
    
    for(int i = 0; i < nums.length - 2; i++) {
        int lo = i + 1;
        int hi = nums.length - 1;
        
        while(lo < hi) {
            int curr = nums[i] + nums[lo] + nums[hi];
            
            if(curr == target) return curr;

            if(Math.abs(curr-target) < Math.abs(sum-target)) {
                sum = curr;
            }
            
            if(curr > target) {
                hi--;
            } else {
                lo++;
            }
        }
    }
    return sum;
	}

private int threeSumClosest2(int[] nums, int target) {
	int res=Integer.MAX_VALUE, len=nums.length;
	for(int i=0; i<len-2; i++)
		for(int j=i+1; j<len-1; j++)
			for(int k=j+1; k<len; k++)
				if(Math.abs(nums[i]+nums[j]+nums[k]-target)<res){
					System.out.println(nums[i]+" "+nums[j]+" "+nums[k]);
					res=Math.abs(nums[i]+nums[j]+nums[k]);
				}
	return res;
	}

public int threeSumClosest1(int[] nums, int target) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>((a,b)->Math.abs(target-a)-Math.abs(target-b));
        for(int i=0; i<nums.length; i++)
        	q.add(nums[i]);
        System.out.println(q);
        return q.poll()+q.poll()+q.poll();
    }
}
