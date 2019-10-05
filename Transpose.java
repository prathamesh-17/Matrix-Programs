package matrix;

import java.util.Scanner;

public class Transpose {

	static int[][] transposeMatrix(int[][] matrix)
	{
		int rows = matrix[0].length;
		int cols = matrix.length;
		int tmatrix[][] = new int[rows][cols];
		
		for(int i=0; i<matrix.length; i++)
		{
			for(int j=0; j<matrix[0].length; j++)
			{
				tmatrix[j][i] = matrix[i][j];
			}
		}
		return tmatrix;
	}
	static void print(int[][] matrix)
	{
		for(int i=0; i<matrix.length; i++)
		{
			for(int j=0; j<matrix[0].length; j++)
			{
				System.out.print(matrix[i][j]+" " );
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] matrix = new int[2][3];
		for(int i=0; i<matrix.length; i++)
		{
			for(int j=0; j<matrix[0].length; j++)
			{
				matrix[i][j] = sc.nextInt();
			}
		}

		int rotatedmatrix[][] = transposeMatrix(matrix);
		
		print(rotatedmatrix);
		sc.close();

	}

}
