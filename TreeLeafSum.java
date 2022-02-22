package leetcode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Stack;

public class TreeLeafSum {

	public static void main(String[] args) {
		TreeLeafSum o = new TreeLeafSum();
		TreeNode left = new TreeNode(4);
		TreeNode right = new TreeNode(8);
		TreeNode root = new TreeNode(5, left, right);
		System.out.println(o.pathSum(root, 9));
	}
	List<List<Integer>> list;
	 public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
		 list = new ArrayList();
	     findSum(root, targetSum, 0);
	     for(List<Integer> l:list){
	    	 int sum=0;
	     for(int i=0; i<l.size(); i++){
	    	 sum=sum+l.get(i);
	     }
	     if(sum!=targetSum)
	    	 list.remove(l);
	     }
	     return list;
	    }
	 private Collection<? extends List<Integer>> findSum(TreeNode root, int targetSum, int sum) {
		 
		 if(root==null)
			 return null;
		 
		 list.addAll(root.val, findSum(root.left, targetSum, sum));
		 list.addAll(root.val, findSum(root.right, targetSum, sum));
	     
		return null;
	}
	protected class TreeNode {
		    int val;
		    TreeNode left;
		    TreeNode right;
		    TreeNode() {}
		    TreeNode(int val) { this.val = val; }
		    TreeNode(int val, TreeNode left, TreeNode right) {
		        this.val = val;
		        this.left = left;
		        this.right = right;
		    }
		}
	
	
}

