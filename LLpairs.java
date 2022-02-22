package leetcode;

public class LLpairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public int pairSum(ListNode head) {
        int length = 0;
        ListNode curr = head;
        while(curr!=null){
        	length++;
        	curr=curr.next;
        }
        System.out.println("len :"+length);
        length = length/2;
        curr = head;
        int arr[] = new int[len];
        int i=0;
        int max=Integer.MIN_VALUE;
        while(i<length){
        	arr[i]=curr.val
        	curr = curr.next;
        	i++;
        }
        while(i>=0){
        	arr[i]=arr[i]+curr.val;
        	curr = curr.next;
        	i--;
        	max = Math.max(max, arr[i]);
        }
        return max;
    }
}
