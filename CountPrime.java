import java.util.Scanner;

public class CountPrime {
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
		int ct=CountPrime(ar);
		System.out.println(ct);
	}
	static int CountPrime(int [] a)
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			boolean isprime=false;
			
			for(int j=2;j<=a[i]/2;j++)
			{
				if(a[i]%j==0) {
					isprime=true;
					
			}
		}
		if(isprime==false)
			{
				count++;
			}		
			
		}
		return count;
	}
}
