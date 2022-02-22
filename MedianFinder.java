package leetcode;

import java.util.ArrayList;
import java.util.List;

public class MedianFinders {

	public static void main(String[] args) {
		MedianFinder obj = new MedianFinder();
		 obj.addNum(2);
		 double param_2 = obj.findMedian();
	}
	
	

}

class MedianFinder {
	static List<Integer> list;
    public MedianFinder() {
        list = new ArrayList<Integer>();
    }
    
    public void addNum(int num) {
        list.add(num);
    }
    
    public double findMedian() {
        if(list.size()==0)
        	return 0.0d;
        if(list.size()==1)
        	return list.get(0)/1;
        
        if(list.size()%2==1){
        	int pos=list.size()/2;
        	return list.get(pos)/1;
        }else{
        	int x=list.size()/2;
        	int y=x+1;
        	return (list.get(x)+list.get(y))/2;
        }
    }
}