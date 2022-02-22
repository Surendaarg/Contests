package leetcode;

public class ArrayConcat {

	public static void main(String[] args) {
		ArrayConcat o = new ArrayConcat();
		int n[]={1,2,1};
		int res[]=o.getConcatenation(n);
		for(int i=0; i<res.length; i++)
			System.out.println(res[i]+" ");
	}

public int[] getConcatenation(int[] nums) {
        int res[]= new int[nums.length*2];
        for(int i=0; i<nums.length; i++){
        	res[i]=res[i+nums.length]=nums[i];
        }
        return res;
    }
}
