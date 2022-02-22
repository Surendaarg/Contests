package leetcode;

import java.util.PriorityQueue;

public class prefix {

	public static void main(String[] args) {
		prefix o =new prefix();
		int[] num = {5,4,9};
		System.out.println(o.minStoneSum(num, 2));
	}
	
	public boolean isPrefixString(String s, String[] words) {
        int len=s.length();
        int size = words.length;
        String res="";
        int i=0;
        while(res.length()<len && i<size){
            res=res+words[i];
            i++;
        }
        if(res.length()==s.length()){
        if(res.equals(s) && i>0){
            return true;
        }
        }
        return false;
    }

public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>((a,b)->b-a);
        int len = piles.length;
        for(int i=0; i<len; i++)
        	q.add(piles[i]);
        int res=0;
        while(k>0){
        	int a=q.poll();
        	int b=(int)Math.floor(a/2);
        	q.add(a-b);
        	System.out.println(a+" "+b);
        	k--;
        }
        while(!q.isEmpty()){
        	res=res+q.poll();
        	System.out.println(q);
        }
        
        return res;
    }
public int minSwaps(String s) {
    int swaps=0;
    if(s.length()==0)
    	return 0;
    char open='[';
    int opencount=0;
    char close=']';
    int closecount=0;
    boolean check=true;
    char[] charray = s.toCharArray();
    while(check){
    	int i=0;
    	for(; i<s.length(); i++){
    		if(s.charAt(i)==open)
    			opencount++;
    		if(s.charAt(i)==close)
    			closecount++;
    		if(opencount<closecount){
    			check=false;
    			break;
    		}
    	}
    	if(check==true)
    		break;
    	else{
    		swaps++;
    		for(int j=s.length()-1;j>0; j++){
    			if(s.charAt(j)==open)
    			{
    				charray[i]='[';
    				charray[j]=']';
    			}
    		}
    		s=charray.toString();
    	}
    }
    return swaps;
}
}
