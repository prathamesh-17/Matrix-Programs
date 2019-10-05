package matrix;


import java.util.Scanner;

public class UniqueElements {

	static void uniqueEle(int[][] matrix)
	{
		int[] u = new int[matrix.length * matrix[0].length];
		int k=0;
		for(int i=0; i<matrix.length; i++)
		{
			for(int j=0; j<matrix[0].length; j++)
			{
				u[k++] = matrix[i][j];
			}
		}
		for(int i=0; i<u.length; i++)
		{
			int count = 0;
			for(int j=0; j<u.length;j++)
			{
				if(u[i] == u[j])
					count++;
			}
			if(count == 1)
				System.out.print(u[i]+" ");
		}
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

			
			uniqueEle(matrix);
			sc.close();

	}

}
