package leetcode;

public class Monotone {

	public static void main(String[] args) {
		Monotone o = new Monotone();
		System.out.println(o.minFlipsMonoIncr("00110"));
	}

public int minFlipsMonoIncr(String s) {
    int len = s.length();    
	int res=len;
	int zeros=0, once=0, flip=0;
        for(int i=0; i<len; i++){
        	if(s.charAt(i)=='0'){
        		if(once!=0)
        		 zeros++;
        	}
        	else
        		once++;
        	zeros = Math.min(once, zeros);
        }
        int i=0, j=len-1;
        boolean cz=true, co=true;
        while(i<j && (cz || co)){
        	if(s.charAt(i)=='0' && cz)
        		i++;
        	if(s.charAt(i)=='1')
        		cz=false;
        	if(s.charAt(j)=='1' && co)
        		j--;
        	if(s.charAt(j)=='0')
        		co=false;
        }
        System.out.println("i "+i+" j "+j);
        int nz=0, no=0;
        for(int m=i; m<=j; m++){
        	if(s.charAt(m)=='0')
        		nz++;
        	else
        		no++;
        }
        System.out.println("zeros "+zeros+" once "+once+" nz "+nz+" no "+no);
        flip = Math.min(nz, no);
        res = Math.min(flip, Math.min(once, zeros));
        return res;
    }
}
