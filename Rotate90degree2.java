package matrix;

import java.util.Scanner;

//rotate in place

public class Rotate90degree2 {
	
	static void rotateMatrix(int matrix[][])
	{
		int length = matrix.length-1;
		   
		  for (int i = 0; i <= (length)/2; i++) {
		      for (int j = i; j < length-i; j++) {
		        
		       //Coordinate 1
		       int p1 = matrix[i][j];
		        
		       //Coordinate 2
		       int p2 = matrix[j][length-i];
		        
		       //Coordinate 3
		       int p3 = matrix[length-i][length-j];
		        
		       //Coordinate 4
		       int p4 = matrix[length-j][i];
		        
		       //Swap values of 4 coordinates.
		       matrix[j][length-i] = p1;
		       matrix[length-i][length-j] = p2;
		       matrix[length-j][i] = p3;
		       matrix[i][j] = p4;
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

		rotateMatrix(matrix);
		
		print(matrix);
		sc.close();
	}

}
