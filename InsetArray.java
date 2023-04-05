import java.util.Scanner;
public class InsetArray {
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
	int [] insertArr(int [] a, int ele, int in)
	{
		if(in<0|| in>a.length)
		{
			System.out.println("Enter inder not in range");
		    return a;
		}   
		int[] c = new int[a.length+1];
		c[in]=ele;
		
		for(int i=0;i<a.length;i++)
		{
			if(i<in)
				c[i]=a[i];
			else
				c[i+1]=a[i];
		}
		return c;
	}

}
