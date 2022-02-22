package leetcode;

import java.util.PriorityQueue;

public class SplitArray {

	public static void main(String[] args) {
		int[] nums = {3,2,1,0,4,6,12};
		SplitArray o = new SplitArray();
		System.out.println(o.partitionDisjoint(nums));
	}

	 public int partitionDisjoint(int[] nums) {
		 int comparisonItem = nums[0];
			int localMax = comparisonItem;
			int partitionIdx = 0;
			for (int i = 1; i < nums.length; i++) {
				if (nums[i] < comparisonItem) {
					partitionIdx = i;
					comparisonItem = localMax;
				}
				else localMax = Math.max(localMax, nums[i]);
			}
			return partitionIdx + 1;
	 }
}
