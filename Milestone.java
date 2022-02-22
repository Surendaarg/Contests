package leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Milestone {

	public static void main(String[] args) {
		Milestone o = new Milestone();
		int arr[] = {5,7,5,7,9,7};
		System.out.println(o.numberOfWeeks(arr));
	}
//97979797979797/9797/7777777777/75757575755
public long numberOfWeeks(int[] milestones) {
        long sum=0;
        Arrays.sort(milestones);
        int len = milestones.length;
        for(int i=0; i<len; i++)
        	sum=sum+milestones[i];
        long restSum = sum-milestones[len-1];
        if(milestones[len-1]<=restSum+1)
        	return sum;
        else
        	return restSum*2+1;
    }
}
