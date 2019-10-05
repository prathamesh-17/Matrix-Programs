package matrix;

import java.util.Arrays;
import java.util.Scanner;

public class SortMatrix {
	
	static void sortMatrix(int[][] matrix)
	{
		int[] temp = new int[matrix.length * matrix.length];
		int k=0;
		for(int i=0; i<matrix.length; i++)
		{
			for(int j=0; j<matrix.length; j++)
			{
				temp[k++] = matrix[i][j];
			}
		}
		
		Arrays.sort(temp);
		
		 k=0;
		for(int i=0; i<matrix.length; i++)
		{
			for(int j=0; j<matrix.length; j++)
			{
				  matrix[i][j] = temp[k++];
			}
		}
		
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

		sortMatrix(matrix);
		
		print(matrix);
		sc.close();

	}

}
