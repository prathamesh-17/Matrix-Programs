package matrix;

import java.util.Arrays;
import java.util.Scanner;

//Find maximum element of each row in a matrix

public class MaximumElement {

	static int[] maximumEle(int[][] matrix)
	{
		int[] max = new int[matrix.length];
		for(int i=0; i<matrix.length; i++)
		{
			max[i] = Integer.MIN_VALUE;
			for(int j=0; j<matrix[0].length; j++)
			{
				if(matrix[i][j]>max[i])
				{
					max[i] = matrix[i][j];
				}
			}
		}
		return max;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] matrix = new int[3][3];
		for(int i=0; i<matrix.length; i++)
		{
			for(int j=0; j<matrix[0].length; j++)
			{
				matrix[i][j] = sc.nextInt();
			}
		}

		int rotatedmatrix[] = maximumEle(matrix);
		
		System.out.print(Arrays.toString(rotatedmatrix));
		sc.close();

	}

}
