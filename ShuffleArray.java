package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {

	public static void main(String[] args) {
		int[]  nums = {1,2,3};
		Solution obj = new Solution(nums);
		int[] param_0 = obj.shuffle();
		display(param_0);
		int[] param_1 = obj.reset();
		display(param_1);
		int[] param_2 = obj.shuffle();
		display(param_2);
	}

	private static void display(int[] p) {
		for(int i=0; i<p.length; i++)
			System.out.print(p[i]+" ");
		System.out.println();
	}

}
class Solution {
	List<Integer> original;
	List<Integer> duplicate;
	int[] nums;
	public Solution(int[] nums) {
        this.nums=nums;
        original = new ArrayList<Integer>();
        for(int i:nums)
        	original.add(i);
        duplicate = new ArrayList<Integer>(original);
    }
    
    public int[] reset() {
    	listToArray(original);
        return nums;
    }
    
    private void listToArray(List<Integer> list) {
		for(int i=0; i<nums.length; i++)
			nums[i]=list.get(i);
	}

	public int[] shuffle() {
    	Collections.shuffle(duplicate);
    	listToArray(duplicate);
        return nums;
    }
}