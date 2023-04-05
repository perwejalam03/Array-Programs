
import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array");
		int size=sc.nextInt();
		int [] ar=new int[size];
		System.out.println("enter "+size+ "values");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		boolean [] b=new boolean[ar.length];
		for(int i=0;i<b.length;i++)
		{
			if(b[i]==false)
			{
				for(int j=i+1;j<b.length;j++)
				{
					if(ar[i]==ar[j])
					{
						b[j]=true;
					}
				}
				System.out.println(ar[i]);
			}
		}
	}
}
