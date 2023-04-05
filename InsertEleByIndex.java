import java.util.Arrays;
import java.util.Scanner;

public class InsertEleByIndex {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array ");
		int size=sc.nextInt();
		int [] ar=new int[size];
		System.out.println("Enter "+size+ " vales");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("insert element to insert ");
		int ele=sc.nextInt();
		System.out.println("insert index ");
		int in=sc.nextInt();
		int[] n=InsertAr(ar,ele,in);
		System.out.println("After insert the element ");
		for(int i=0;i<n.length;i++)
		{	
		  System.out.print(n[i]+ " ");
		}
		System.out.println();
	}
	static int[] InsertAr(int[] a,int ele,int in)
	{
		if(in<0 || in>a.length)
		{
			System.out.println("Enter index not in range ");
			return a;
		}
		int c[]=new int[a.length+1];
		c[in]=ele;
		for(int i=0;i<a.length;i++)
		{
			if(i<in)
			{
				c[i]=a[i];
			}
			else
			{
				c[i+1]=a[i];
			}
		}
		return c;
	}
}
