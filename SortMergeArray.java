import java.util.Scanner;
public class SortMergeArray {
	static int [] sortArray(int a[],int b[])
	{
		int c[]=new int [a.length+b.length];
		int i=0,j=0,k=0;
		while(i<a.length&&j<b.length)
		{
			c[k++]=a[i]<b[j]?a[i++]:b[j++];
		}
		while (i<a.length)
		{
			c[k++]=a[i++];
		}
		while (j<b.length)
		{
			c[k++]=b[j++];
		} 
		return c;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first 1 Array size");
		int n=sc.nextInt();
		int a[]=new int [n];
		System.out.println("Enter the "+n+" element in First Element");
		for (int i = 0; i < a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the 2 Array size");
		int m=sc.nextInt();
		int b[]=new int[m];
		System.out.println("Enter the "+m+" element in Second Element");
		for (int i = 0; i < b.length; i++)
		{
			b[i]=sc.nextInt();
		}
		int c[]=sortArray(a,b);
		System.out.println("After sorting And merge the Element of Array");
		System.out.print("[");
		for (int i = 0; i < c.length; i++)
		{
			if(i<c.length-1)
				System.out.print(c[i]+",");
			else
				System.out.print(c[i]);
		}
		System.out.print("]");
	}
}
