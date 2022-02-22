package leetcode;

public class firstPalind {

	public static void main(String[] args) {
		firstPalind o= new  firstPalind();
		String[] words = {"abc","car","ada","racecar","cool"};
		System.out.println(o.firstPalindrome(words ));
	}

    public String firstPalindrome(String[] words) {
        String res = "";
        for(String s:words){
        	if(isPalindrome(s))
        		return s;
        }
        return res;
    }

	private boolean isPalindrome(String s) {
		StringBuffer rev = new StringBuffer();
		for(int i=s.length()-1; i>=0; i--){
			rev.append(s.charAt(i));
		}
		if(s.equals(rev.toString()))
			return true;
		return false;
	}
}
