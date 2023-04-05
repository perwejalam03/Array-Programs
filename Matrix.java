import java.util.Scanner;
public class Matrix 
{
	int [][] readMat() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row");
		int row=sc.nextInt();
		System.out.println("Enter the col");
		int col=sc.nextInt();
		int [][] mat=new int[row][col];
		System.out.println("enter "+row*col+ " values ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		return mat;
	}
	void disMat(int [][] mat)
	{
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				System.out.print(mat[i][j]+" ");

			}
			System.out.println();
		}
	}
	int biggestMat(int [][] mat)
	{
		int big=mat[0][0];
		for(int i=0;i<mat.length;i++)
		{
			for (int j = 0; j < mat[i].length; j++)
			{
				if(mat[i][j]>big)
				{
					big=mat[i][j];
				}
			}
		}
		return big;
	}
	int smallestMat(int [][] mat)
	{
		int small=mat[0][0];
		for (int i = 0; i < mat.length; i++)
		{
			for (int j = 0; j < mat[i].length; j++)
			{
				if(mat[i][j]<small)
					small=mat[i][j];
			}
		}
		return small;
	}
	boolean isPrime(int num)
	{
		for(int i=2;i<num/2;i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}
	int CountPrime(int [][] mat)
	{
		int count=0;
		for (int i = 0; i < mat.length; i++) 
		{
			for (int j = 0; j < mat[i].length; j++) 
			{
				boolean rs=isPrime(mat[i][j]);
				if(rs==true)
					count++;
			}
		}
		return count;
	}
	int [][] addMat(int [][] x,int [][] y)
	{
		if(x.length!=y.length || x[0].length!=y[0].length)
		{
			return null;
		}
		int [][] z=new int [x.length][x[0].length];
		for (int i = 0; i < z.length; i++) 
		{
			for (int j = 0; j < z[i].length; j++) 
			{
				z[i][j]=x[i][j]+y[i][j];
			}
		}
		return z;
	}

}
