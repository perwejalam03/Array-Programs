import java.util.Arrays;
import java.util.Scanner;

public class ReplaceSumOfDig {
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
		int[] sm=SumOfDig(ar);
		System.out.println(Arrays.toString(sm));
	}
	static int[] SumOfDig(int [] a)
	{
		
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			while(a[i]!=0) {
			int last=a[i]%10;
			sum=sum+last;
			a[i]=a[i]/10;
			}
			a[i]=sum;
		}
		return a;
		
	}
}
