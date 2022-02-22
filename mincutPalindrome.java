package leetcode;

public class mincutPalindrome {

	public static void main(String[] args) {
		mincutPalindrome o = new mincutPalindrome();
		System.out.println(o.minCut("aab"));
	}

	public int minCut(String s) {
		int len=s.length();
        int cut=0;
        s.startsWith(prefix)
        if(s.length()<=1)
        	return 0;
        for(int i=0; i<len; i++){
        	boolean check=false;
        	for(int j=len-1; j>i; j--){
        		if(isPalindrome(s.substring(i,j+1))){
        			i=j;
        			check=true;
        			break;
        		}
        	}
        	if(check==false)
        		cut++;
        }
        return cut;
    }

	private boolean isPalindrome(String s) {
		for(int i=0,j=s.length()-1; i<j; i++, j--){
			if(s.charAt(i)!=s.charAt(j))
				return false;
		}
		return true;
	}
}
