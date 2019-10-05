package matrix;

import java.util.Scanner;

public class Rotate90degree {
	
	static int[][] rotateMatrix(int matrix[][])
	{
		int rows = matrix[0].length;
		int cols = matrix.length;
		int rmatrix[][] = new int[rows][cols];
		for(int i=0; i<matrix.length; i++)
		{
			for(int j=0; j<matrix[0].length; j++)
			{
				rmatrix[j][(cols-1)-i] = matrix[i][j];
			}
		}
		return rmatrix;
	}

	static void print(int[][] matrix)
	{
		for(int i=0; i<matrix.length; i++)
		{
			for(int j=0; j<matrix.length; j++)
			{
				System.out.print(matrix[i][j]+" " );
			}
			System.out.println();
		}
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

		int rotatedmatrix[][] = rotateMatrix(matrix);
		
		print(rotatedmatrix);
		sc.close();
	}

}
