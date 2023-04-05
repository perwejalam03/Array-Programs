import java .util.Scanner;
public class Array8 {
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
	void dispArray(int [] ar)
	{
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+ " ");
		}
		System.out.println();
	}
	/*
	boolean isprime(int n)
	{
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	int countprime(int [] num)
	{
		int count=0;
		for(int i=0;i<num.length;i++)
		{
			boolean rs=isprime(num[i]);
			if(rs==true)
				count++;
		}
		return count;
	}*/
	void sumofDigit(int [] num)
	{
		for(int i=0;i<num.length;i++)
		{
			int sum=0,v=num[i];
			while(v!=0)
			{
				sum=sum+v%10;
				v=v/10;
			}
			num[i]=sum;
		}
	}
	
}
