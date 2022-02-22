package leetcode;

public class FillWater {

	public static void main(String[] args) {
		int ht[] = {4,2,0,3,2,5};
		FillWater o = new FillWater();
		System.out.println(o.trap(ht));
	}

	public int trap(int[] height) {
	    if(height.length==0){
            return 0;
        }
        
        int leftArr []  = new int[height.length];
        int rightArr []  = new int[height.length];
        int maxWater =0;
        
        
        leftArr[0] = height[0];
        int n = height.length;
        for(int i=1;i<n;i++){
            leftArr[i] = Math.max(leftArr[i-1],height[i]);
        }
        
        rightArr[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            rightArr[i] = Math.max(rightArr[i+1],height[i]);
        }
        display(leftArr);
        display(rightArr);
         for(int i=0;i<n;i++){
             
             maxWater = maxWater + Math.min(leftArr[i],rightArr[i]) - height[i];
         }
        
       return maxWater; 
    }

	private void display(int[] arr) {
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
}
