package leetcode;

public class ArrayToBinaryTree {

	public static void main(String[] args) {
		int arr[] = {-10,-3,0,5,9};
		ArrayToBinaryTree o = new ArrayToBinaryTree();
		System.out.println(o.sortedArrayToBST(arr));
	}
	
public TreeNode sortedArrayToBST(int[] nums) {
        
        return sortedArrayToBSTImpl(nums, 0, nums.length-1);
    }

private TreeNode sortedArrayToBSTImpl(int[] nums, int i, int j) {
	if(i>j)
		return null;
	int mid = (i+j+1)/2;
	TreeNode root = new TreeNode(nums[mid]);
	root.left=sortedArrayToBSTImpl(nums, i, mid-1);
	root.right = sortedArrayToBSTImpl(nums, mid+1, j);
	return root;
}

}
class TreeNode {
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