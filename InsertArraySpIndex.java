import java.util.Scanner;
public class InsertArraySpIndex {
	static int[] insertel(int a[],int ele,int in)
	{
		if(in < 0||in>a.length)
		{
			System.out.println("Index not in Range");
			return a;
		} 
		int n[]=new int [a.length+1];
		n[in] = ele;
		for (int i = 0; i < a.length; i++)
		{
			if(i<in)
				n[i]=a[i];
			else
				n[i+1]=a[i];
		} 
		return n;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array size");
		int n=sc.nextInt();
		int a[]=new int [n];
		System.out.println("Enter the "+n+" element in First Element");
		for (int i = 0; i < a.length; i++)
		{
			a[i]=sc.nextInt();
		} 
		System.out.println("Enter the Element which you want to insert");
		int m=sc.nextInt();
		System.out.println("Enter the Index postion");
		int o=sc.nextInt();
		int c[]=insertel(a,m,o);
		System.out.println("After Insert the element");
		System.out.print("[");
		for (int i = 0; i < c.length; i++)
		{
			if(i<c.length-1)
				System.out.print(c[i]+",");
			else
				System.out.print(c[i]);
		}
		System.out.println("]");
	}

}
