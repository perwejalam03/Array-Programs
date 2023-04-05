import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array elements");
		int size=sc.nextInt();
		int [] ar=new int[size];
		System.out.println("enter "+size+ " values");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
//		for(int j=ar.length-1;j>=0;j--)
//		{
//			System.out.print(" "+ ar[j]);
//		}
		int c []=ReverseArr(ar);
		System.out.println(Arrays.toString(c));
	}
	static int [] ReverseArr(int [] a)
	{
		int k=0;
		int [] b=new int[a.length];
		for(int i=a.length-1;i>=0;i--)
		{
			b[k]=a[i];
			k++;
		}
		
		return b;
		
	}
}
