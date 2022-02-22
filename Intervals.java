package leetcode;

import java.util.PriorityQueue;

public class Intervals {

	public static void main(String[] args) {
		Intervals o = new Intervals();
		int[][] intervals = {{1,4}, {3,6}, {2,8}};
		System.out.println(o.removeCoveredIntervals(intervals));
	}

    public int removeCoveredIntervals(int[][] intervals) {
        int res = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((a,b) -> a.i==b.i?b.j-a.j:a.i-b.i);
        int len = intervals.length;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int i=0; i<len; i++){
        	pq.add(new Pair(intervals[i][0], intervals[i][1]));
        	min = Math.min(min, intervals[i][0]);
        	max = Math.max(max, intervals[i][1]);
        }
        max = min;
        while(!pq.isEmpty()){
        	System.out.println(pq.peek().toString());
        	int end = pq.poll().j;
        	if(max<end){
        		res++;
        		max = end;
        	}
        }
        return res;
    }
    
    class Pair{
    	int i;
    	int j;
    	Pair(int i, int j){
    		this.i = i;
    		this.j = j;
    	}
		@Override
		public String toString() {
			return "Pair [i=" + i + ", j=" + j + "]";
		}
    }
}
