package leetcode;

import java.util.HashSet;

public class BinaryConsecutiveOnce {

	public static void main(String[] args) {
		BinaryConsecutiveOnce o = new BinaryConsecutiveOnce();
		System.out.println(o.findIntegers(5));
	}

public int findIntegers(int n) {
    boolean[] b=new boolean[n+1];
    if(n==1)
    	return 2;
    b[0]=true;
    b[1]=true;
	for(int i=2; i<=n; i++){
		if(b[i]==false){
        	String s=Integer.toBinaryString(i);
        	boolean c=true;
        	for(int j=0; j<s.length()-1 && c==true; j++)
        		if(s.charAt(j)=='1' && s.charAt(j+1)=='1')
        			c=false;
        	for(int k=i;k<=n; k=k*2)
        		b[k]=c;
		}
        }
	int res=0;
        for(int i=0; i<=n;i++)
        	if(b[i]==true)
        		res++;
        return res;
    }
}
