package leetcode;

import java.util.HashSet;
import java.util.Scanner;

public class Hilbert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int i=0;i<tc; i++){
			int n=sc.nextInt();
			int arr[] = new int[n];
			for(int j=0;j<n;j++)
				arr[j]=sc.nextInt();
			if(find(arr, n)){
				System.out.println("YES");
			}
			else
				System.out.println("NO");
		}
		
	}

	private static boolean find(int[] arr, int n) {
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0;i<n;i++){
			int num;
			if(arr[i]<0)
				num=(arr[i]*1000000000*n)%n;
			else 
				num=arr[i];
			if(set.contains((num+i)%n))
				return false;
			else
				set.add((num+i)%n);
		}
		return true;
	}

}
