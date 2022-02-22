package leetcode;

import java.util.HashSet;
import java.util.PriorityQueue;

public class chair {

	public static void main(String[] args) {
		chair o = new chair();
		int[][] times = {{33889,98676},{80071,89737},{44118,52565},{52992,84310},{78492,88209},{21695,67063},{84622,95452},{98048,98856},{98411,99433},{55333,56548},{65375,88566},{55011,62821},{48548,48656},{87396,94825},{55273,81868},{75629,91467}};
		System.out.println(o.smallestChair(times, 6));
	}

public int smallestChair(int[][] times, int targetFriend) {
        int chairnum=0;
        PriorityQueue<Friend> inq = new PriorityQueue<Friend>((a,b)->a.in-b.in);
        PriorityQueue<Friend> outq = new PriorityQueue<Friend>((a,b)->a.out-b.out);
        HashSet<Friend> set = new HashSet<Friend>();
        int targetIn = times[targetFriend][0];
        for(int i=0; i<times.length; i++){
        	if(times[i][0]<targetIn){
        	Friend a =new Friend(i,times[i][0], times[i][1]);
        	inq.add(a);
        	if(times[i][1]<targetIn)
        	outq.add(a);
        	}
        }
        System.out.println("in "+inq+" peak "+inq.peek());
        System.out.println("out "+outq+" peak "+outq.peek());
        boolean seat[] = new boolean[times.length];
        for(int i=0; i<times.length; i++)
        	seat[i]=false;
        while(!inq.isEmpty()){
        	System.out.println(inq.peek()+" out "+outq.peek());
        	Friend a=inq.poll();
        	Friend b=outq.peek();
        	if(b.out<=a.in){
        		if(a.num==b.num){
        			outq.poll();
        			continue;
        		}
        		b=outq.poll();
        		for(Friend o:set)
        			if(o.num==b.num)
        			{
        				seat[o.seat]=false;
        				set.remove(o);
        				break;
        			}
    			seat[b.seat]=false;
        	}
        		
        		int k=0;
        		 while(seat[k]==true)
        			 k++;
        		 seat[k]=true;
        		 a.seat=k;
        		set.add(a);
        	System.out.println(set);
        }
        for(int i=0; i<times.length; i++)
        	if(seat[i]==false)
        		return i;
        return 0;
    }
}
class Friend{
	int num;
	int in;
	int out;
	int seat;
	public Friend(int num, int in, int out) {
		this.num = num;
		this.in = in;
		this.out = out;
		this.seat=0;
	}
	@Override
	public String toString() {
		return "Friend [num=" + num + ", in=" + in + ", out=" + out + ", seat=" + seat + "]";
	}
	
	
}