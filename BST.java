package leetcode;

import java.util.List;

public class BST {

	public static void main(String[] args) {
		BST o = new BST();
		int res[] = o.canMerge(trees);
	}

public TreeNode canMerge(List<TreeNode> trees) {
        TreeNode res=new TreeNode();
        if(trees.size()==0)
        	return res;
        
        for(TreeNode t:trees)
    		if(!checkValid(t))
    			return res;
        
        if(trees.size()==1)
        	for(TreeNode t:trees)
        		return t;
        
        boolean isAvailable[]=new boolean[trees.size()-1];
        for(int i=0; i<trees.size()-1; i++)
        	isAvailable[i]=findAvailable(trees.get(i),trees.get(i+1));
        			
        return res;
    }

private boolean findAvailable(TreeNode one, TreeNode two) {
	if(one.left!=null)
		if(one.left==two.val)
			return true;
	if(one.right!=null)
		if(one.right==two.val)
			return true;
	return false;
}

private boolean checkValid(TreeNode t) {
	if(t.left!=null)
	if(t.left.val>t.val)
		return false;
	if(t.right!=null)
		if(t.right.val<t.val)
			return false;
	return true;
}
private class TreeNode {
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
