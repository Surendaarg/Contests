package leetcode;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matrix o = new Matrix();
		int[][] matrix = {{1,1,1},{1,2,3}, {1,2,3}};
		System.out.println(o.checkValid(matrix ));
	}

    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        boolean[] flag = new boolean[n];
        for(int i=0; i<n; i++){
        	flag = new boolean[n];
        	for(int j=0; j<n; j++){
        		if(flag[matrix[i][j]]==false)
        			flag[matrix[i][j]] = true;
        		else
        			return false;
        	}
        }
        for(int i=0; i<n; i++){
        	flag = new boolean[n];
        	for(int j=0; j<n; j++){
        		if(flag[matrix[j][i]]==false)
        			flag[matrix[j][i]] = true;
        		else
        			return false;
        	}
        }
        return true;
    }
}
