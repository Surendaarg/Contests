package leetcode;

public class GoodNumber {

	public static void main(String[] args) {
		GoodNumber o = new GoodNumber();
		o.countGoodNumbers(4);
	}
public int countGoodNumbers(long n) {
        int t=1;
        int mod = 1000000007;
        while(t<=n){
        	if(t%2==1)
        		t=t*5%mod;
        	if(t%2==0)
        		t=t*4%mod;
        }
        
        return t;
    }
}
