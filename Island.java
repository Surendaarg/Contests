package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Island {

	public static void main(String[] args) {
		int mat[][] = {{0,0,0,0,0,0,0},{0,1,1,1,1,0,0},{0,1,0,0,1,0,0},{1,0,1,0,1,0,0},{0,1,0,0,1,0,0},{0,1,0,0,1,0,0},{0,1,1,1,1,0,0}};
		Island o = new Island();
		System.out.println(o.largestIsland(mat));
	}

public int largestIsland(int[][] grid) {
        int max=0;
        int x = grid.length;
        int y = grid[0].length;
        HashSet<Pair> set = new HashSet<Pair>();
        for(int i=0; i<x; i++){
        	for(int j=0; j<y; j++){
        		if(grid[i][j]==1)
        			continue;
        		else{
        			if(i>0)
        				if(grid[i-1][j]==1){
        					set.add(new Pair(i, j));
        					continue;
        				}
        			if(j>0)
        				if(grid[i][j-1]==1){
        					set.add(new Pair(i, j));
        					continue;
        				}
        			if(i<x-1)
        				if(grid[i+1][j]==1){
        					set.add(new Pair(i, j));
        					continue;
        				}
        			if(j<y-1)
        				if(grid[i][j+1]==1){
        					set.add(new Pair(i, j));
        					continue;
        					}
        		}
        	}
        	}
        System.out.println("set :"+set);
        if(set.size()>0)
        for(Pair e:set){
        	boolean[][] visited = new boolean[x][y];
        max=Math.max(max, findCount(grid, e.i, e.j, x, y, visited, 0));
        }
        if(set.size()==0){
        	boolean[][] visited = new boolean[x][y];
        	max=Math.max(max, findCount(grid, 0, 0, x, y, visited, 0));
        }
        return max;
    }

private int findCount(int[][] grid, int i, int j, int x, int y, boolean[][] visited, int count) {
	visited[i][j]=true;
	count++;
	if(i>0)
		if(grid[i-1][j]==1 && visited[i-1][j]==false)
			count=findCount(grid, i-1, j, x, y, visited, count);
	if(j>0)
		if(grid[i][j-1]==1 && visited[i][j-1]==false)
			count=findCount(grid, i, j-1, x, y, visited, count);
	if(i<x-1)
		if(grid[i+1][j]==1 && visited[i+1][j]==false)
			count=findCount(grid, i+1, j, x, y, visited, count);
	if(j<y-1)
		if(grid[i][j+1]==1 && visited[i][j+1]==false)
			count=findCount(grid, i, j+1, x, y, visited, count);
	return count;
}
class Pair{
	int i, j;

	public Pair(int i, int j) {
		super();
		this.i = i;
		this.j = j;
	}

	@Override
	public String toString() {
		return "Pair [i=" + i + ", j=" + j + "]";
	}
	
}
}
