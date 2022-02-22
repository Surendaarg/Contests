package leetcode;

import java.util.PriorityQueue;

public class kthSmallestElement {

	public static void main(String[] args) {
		int mat[][] = {{3,8,8},{3,8,8}, {3,9,13}};
		System.out.println(find(mat,8));
	}

	private static int find(int[][] mat, int k) {
		int num=0;
		int row = mat.length;
		int col = mat[0].length;
//		System.out.println(row +""+ col);
		int idx[] = new int[row];
		for(int i=0; i<row; i++){
			idx[i]=0;
		}
		int min=0;
		while(k>0){
		for(int i=0; i<row; i++)
		{
			while(idx[i]>=col)
				i++;
			while(idx[min]>=col)
				min++;
			if(mat[i][idx[i]]<=mat[min][idx[min]])
				min=i;
			System.out.println(mat[i][idx[i]]+" "+mat[min][idx[min]]);
		}
		idx[min]++;
		k--;
		}
		for(int i=0; i<row; i++){
			System.out.print(idx[i]+" ");
		}
		System.out.println(min);
		num=mat[min][--idx[min]];
		return num;
	}

}
