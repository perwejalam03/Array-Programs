import java.util.Arrays;
import java.util.Scanner;

public class MergeZigZag {
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
		System.out.println("Enter the 2nd Array ");
		int size2=sc.nextInt();
		int [] ar2=new int[size2];
		System.out.println("Enter "+size2+ " vales");
		for(int i=0;i<ar2.length;i++)
		{
			ar2[i]=sc.nextInt();
		}
		int mer []=MergeAr(ar,ar2);
		System.out.println("After merge "+Arrays.toString(mer));
	}
	static int [] MergeAr(int [] a, int [] b)
	{
		int [] mer=new int[a.length+b.length];
		int j=0,k=0;
		for(int i=0;i<mer.length;i++)
		{
			if(j<a.length&& k<b.length)
			{
				mer[i]=a[j];
				j++;
				i++;
				mer[i]=b[k];
				k++;
			}
			else if(j<a.length)
			{
				mer[i]=a[j];
				j++;
			}
			else if(k<b.length)
			{
				mer[i]=b[k];
				k++;
			}
		}
		return mer;
	}
}
