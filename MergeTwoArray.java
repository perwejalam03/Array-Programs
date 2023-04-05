import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st Array ");
		int size1=sc.nextInt();
		int [] ar1=new int[size1];
		for(int i=0;i<ar1.length;i++)
		{
			ar1[i]=sc.nextInt();
		}
		System.out.println("Enter 2nd Array ");
		int size2=sc.nextInt();
		int [] ar2=new int[size2];
		for(int i=0;i<ar2.length;i++)
		{
			ar2[i]=sc.nextInt();
		}
		int [] m=mergearray(ar1,ar2);
		System.out.println(Arrays.toString(m));
	}
	static int [] mergearray(int[] ar1,int [] ar2)
	{
		int [] c=new int[ar1.length+ar2.length];
		for(int i=0;i<ar1.length;i++)
		{
			c[i]=ar1[i];
		}
		for(int j=0;j<ar2.length;j++)
		{
			c[ar1.length+j]=ar2[j];
		}
		return c;
	}
}
