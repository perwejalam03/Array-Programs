import java.util.Scanner;

public class SumOfENandOddNos {
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
		int s [] =SumEO(ar);
		System.out.println("sum of EN "+s[0]);
		System.out.println(" Sum of ON "+s[1]);
	}
	static int [] SumEO(int [] a)
	{
		int se=0;
		int so=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				se=se+a[i];
			else
				so=so+a[i];
		}
		int sm []= {se,so};
		return sm;
	}
}
