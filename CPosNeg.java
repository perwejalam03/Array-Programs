import java.util.Arrays;
import java.util.Scanner;

public class CPosNeg {
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
		int c[]=CPN(ar);
		System.out.println("count pos "+Arrays.toString(c));
	}
	static int [] CPN(int [] a)
	{
		int cp=0;
		int np=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=0)
				cp++;
			else
				np++;
		}
		int c [] = {cp,np};
		return c;
	}
}
