package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class TreeLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

public List<List<Integer>> levelOrder(Node root) {
	List<List<Integer>> list = new ArrayList();
	if(root==null)
		return null;
	
	Queue<Node> que = new LinkedList<Node>();
	que.add(root);
	List<Integer> alist = new ArrayList();
	alist.add(que.peek().val);
	list.add(alist);
	while(!que.isEmpty()){
		Queue<Node> temp = new LinkedList<Node>();
		List<Integer> blist = new ArrayList();
		Node parent =que.poll();
		List<Node> child = parent.children;
		for(int i=0; i<child.size(); i++){
			temp.add(child.get(i));
			blist.add(child.get(i).val);
		}
		if(blist.size()>0)
		list.add(blist);
		que=temp;
	}
	return list;
    }

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
}
