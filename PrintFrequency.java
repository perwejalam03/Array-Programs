import java.util.Arrays;
import java.util.Scanner;

public class PrintFrequency {
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
		Freq(ar);
	}
	static void Freq(int [] a)
	{
		boolean [] b=new boolean[a.length];
		for(int i=0;i<b.length;i++)
		{
			if(b[i]==false)
			{
				int count=1;
				for(int j=i+1;j<b.length;j++)
				{
					if(a[i]==a[j])
					{
						count++;
						b[j]=true;
					}
				}
				System.out.println(a[i]+ " ---> "+ count);
			}
		}
		
	}
}
