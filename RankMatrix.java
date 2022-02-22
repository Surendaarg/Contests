package leetcode;

public class RankMatrix {

	public static void main(String[] args) {
		int mat[][] = {{1,2},{3,4}};
		RankMatrix o = new RankMatrix();
		int res[][]=o.matrixRankTransform(mat);
		display(res);
	}

private static void display(int[][] res) {
	for(int i=0; i<res.length; i++){
		for(int j=0; j<res[0].length; j++)
			System.out.print(res[i][j]);
		System.out.println();
	}
	}
int[][] res;
public int[][] matrixRankTransform(int[][] matrix) {
        res =row(matrix);
        return res;
    }

private int[][] row(int[][] matrix) {
		res= int[matrix.length][matrix[0].length];
	
	return null;
}
}
