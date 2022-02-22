package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MaximumRepeated {

	public static void main(String[] args) {
		int n1[] = {1,2,3,2,1};
		int n2[] = {3,1,1,2,3};
		MaximumRepeated o = new MaximumRepeated();
		System.out.println(o.findLength2(n1, n2));
	}

	 public int findLength2(int[] nums1, int[] nums2) {
	        
	        int max = Math.max(nums1.length,nums2.length);
	        
	            int[][] dp = new int[max][max];
	            int res =0;
	            for(int i=0;i<nums2.length;i++){
	                for(int j=0; j<nums1.length; j++){
	                    int r1=nums1[j];
	                    int r2=nums2[i];
	                    if(nums1[j]==nums2[i]){
	                        if(i-1>=0 && j-1>=0){
	                            dp[i][j]=dp[i-1][j-1]+1;
	                        }else{
	                            dp[i][j]=1;
	                        }
	                    }
	                    res=Math.max(res,dp[i][j]);
	                }
	            }
	            for(int i=0; i<max; i++){
	    			for(int j=0; j<max; j++){
	    				System.out.print(dp[i][j]+" ");
	    			}
	    			System.out.println();
	    		}
	        return res;
	        
	        }

	private int findLength(int[] n1, int[] n2) {
		int max = Math.max(n1.length, n2.length);
		int mat[][] = new int[max][max];
		int res=0;
		for(int i=0; i<n1.length; i++)
			for(int j=0; j<n2.length; j++){
				if(n1[i]==n2[j]){
					if(i>0 && j>0)
						mat[i][j]=mat[i-1][j-1]+1;
					else
						mat[i][j]=1;
				}
				res=Math.max(res, mat[i][j]);
			}
		 return res;
	}

	public int findLength1(int[] nums1, int[] nums2) {
	        int res=0;
	        HashMap<Integer, List<Integer>> map = new HashMap<>();
	        
	        for(int i=0; i<nums1.length; i++){
	        	List<Integer> l1 ;
	        	if(map.containsKey(nums1[i])){
	        		l1=map.get(nums1[i]);
	        	}
	        	else
	        		l1 = new ArrayList<Integer>();
	        	l1.add(i);
	        	map.put(nums1[i], l1);
	        }
	        
	        for(int i=0; i<nums2.length; i++){
	        	if(map.containsKey(nums2[i])){
	        			List<Integer> l1 =map.get(nums2[i]);
	        			for(int o:l1){
	        				int count=0;
	        				for(int m=o, n=i;m<nums1.length && n<nums2.length; m++, n++){
	        					if(nums1[m]==nums2[n]){
	        					count++;
	        					res=Math.max(res, count);
	        					}
	        					else{ i=n;
	        					break;
	        					}
	        				}
	        			}
	        		}
	        	}
	        System.out.println(map);
	        return res;
	    }
}
