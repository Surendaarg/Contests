package leetcode;

import java.util.ArrayList;
import java.util.HashSet;

public class Spacess {

	public static void main(String[] args) {
		Spacess o = new Spacess();
		int[] arr = {12,6,12,6,14,2,13,17,3,8,11,7,4,11,18,8,8,3};
		
		//System.out.println(o.addSpaces("LeetcodeHelpsMeLearn", spaces ));
		//System.out.println(o.getDescentPeriods(prices));
		System.out.println(o.kIncreasing(arr, 1));
	}
	
    public int kIncreasing(int[] arr, int k) {
        int res =0;
        int len = arr.length;
        int dp[] = new int[len];
        for(int i=0; i<len; i++){
        	if(i+k<len){
        	if(arr[i]>arr[i+k]){
        		dp[i]=1;
        	}
        	}
        	res = res+dp[i];
        }
        return res;
    }
    public long getDescentPeriods(int[] prices) {
        int len = prices.length;
    	long res = len;
        int dp[] = new int[len];
        dp[0] = 0;
        for(int i=1; i<len; i++){
        	if(prices[i]==prices[i-1]-1)
        		dp[i]=1;
        	if(dp[i-1]>0 && dp[i]==1){
        		dp[i]=dp[i-1]+1;
        	}
        	res = res + dp[i];
        }
    	return res;
    }

    private void display(int[] dp, int len) {
		// TODO Auto-generated method stub
		for(int i=0; i<len; i++){
			System.out.print(dp[i]+" ");
		}
	}

	public String addSpaces(String s, int[] spaces) {
        StringBuffer str = new StringBuffer();
        int j = spaces.length-1;
        int space = spaces[j];
        for(int i=s.length()-1; i>=0; i--){
        	str.append(s.charAt(i));
        	if(i == space){
        		str.append(" ");
        		j--;
        		if(j>=0){
        			space = spaces[j];
        		}
        		else
        			space = -1;
        	}
        	
        }
        return str.reverse().toString();
    }
}
