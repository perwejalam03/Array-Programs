import java.util.Arrays;
import java.util.Scanner;

public class SwapingArr {
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
		int [] m=Swaping(ar);
		System.out.println(Arrays.toString(m));
	}
	static int [] Swaping(int [] a)
	{
		int j=0,k=a.length-1;
		while(j<k)
		{
			int temp=a[j];
			a[j]=a[k];
			a[k]=temp;
			j++;
			k--;
		}
		return a;
	}
	
}
