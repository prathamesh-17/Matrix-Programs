package matrix;

import java.util.Scanner;

public class CountZeros {

	static int count(int[][] matrix)
	{
		int c = 0;
		for(int i=0; i<matrix.length; i++)
		{
			for(int j=0; j<matrix[0].length; j++)
			{
				if(matrix[i][j] == 0)
				{
					c = c+1;
				}
			}
		}
		return c;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] matrix = new int[4][4];
		for(int i=0; i<matrix.length; i++)
		{
			for(int j=0; j<matrix[0].length; j++)
			{
				matrix[i][j] = sc.nextInt();
			}
		}

		System.out.print(count(matrix));
		sc.close();
	}

}
