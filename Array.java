package yuan;

import java.util.Arrays;

public class Array {
	
	public static void main(String args[]) {
		
		int[] num = {1, 2, 4, 8 ,16};
		
		System.out.println(num[2]);
		
		int[] num_2 = new int[5];
		num_2[0] = 1;
		num_2[1] = 2;
		
		System.out.println(num_2[1]);
		
		int[][] num_3 = new int[2][2];
		
		num_3[0][1] = 1;
		num_3[1][1] = 2;
		
		System.out.println(num_3[1][1]);
		
		int[][] num_4 = {{1, 2}, {3, 4, 5}};
		
		System.out.println(num_4[1][2]);
		
		int[] num_5 = Arrays.copyOf(num, 5);
		
		System.out.println(num_5[1]);
		
		int[]x[] = {{1, 2},{3, 4, 5}, {6, 7, 8, 9}};
		int[][]y = x;
		System.out.println(y[2][1]);
		
	}

}
