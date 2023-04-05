import java.util.Scanner;
public class SumOfMatrixEle 
	{
	public static void main(String[] args) 
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
			System.out.println("user entered matrix is ");
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					System.out.print(mat[i][j]+" ");

				}
				System.out.println();
			}
			int sm=sumOfmatrix(mat);
			System.out.println("Sum of matrix element "+sm);
		}
		static int sumOfmatrix(int [][] mat)
		{
			int sum=0;
			for(int i = 0; i < mat.length; i++)
			{
				for(int j = 0; j < mat[i].length; j++) 
				{
					sum=sum+mat[i][j];
				}
			}
			return sum;
		}

	}