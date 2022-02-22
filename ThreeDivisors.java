package leetcode;

public class ThreeDivisors {

	public static void main(String[] args) {
		ThreeDivisors o = new ThreeDivisors();
		System.out.println(o.isThree(4));
	}
	
public boolean isThree(int n) {
        if(n<3)
        	return false;
        int count=0;
        for(int i=1; i<=Math.sqrt(n)+1 && count<=4; i++)
        	if(n%i==0)
        		count++;
        System.out.println(Math.sqrt(n)+" "+count);
        if(count==2)
        	return true;
        return false;
    }
}
