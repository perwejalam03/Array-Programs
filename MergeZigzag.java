import java.util.Scanner;
public class MergeZigzag {
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
	int [] mergeZigzag(int [] a,int [] b)
	{
		int [] c= new int[a.length+b.length];
		int i=0,k=0;
		while(i<a.length&& i<b.length)
		{
			c[k]=a[i];
			k++;
			c[k]=b[i];
			k++;
			i++;
			
		}
		while(i<a.length)
		{
			c[k]=a[i];
			k++;
			i++;
		}
		while(i<b.length)
		{
			c[k]=b[i];
			k++;
			i++;
		}
		return c;
		
	}

}
