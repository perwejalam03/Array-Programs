import java.util.Scanner;
public class DeleteArray {
	int [] readArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size=sc.nextInt();
		int [] ar=new int[size];
		System.out.println("enter "+size+ " values");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		return ar;
	}
	void disArray(int [] num) {
		for(int i=0;i<num.length;i++)
		{
			System.out.print(num[i]+" ");
		}
		System.out.println();
	}
	int [] deleteArr(int [] a,int in)
	{
		if(in<0|| in>a.length)
		{
			System.out.println("Index not in the range:");
			return a;
		}
		int [] c=new int[a.length-1];
		for(int i=0;i<c.length;i++)
		{
			if(i<in)
			{
				c[i]=a[i];
			}
			else
				c[i]=a[i+1];
		}
		return c;
			
	}

}
