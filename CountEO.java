import java.util.Scanner;

public class CountEO {
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
		int [] ct=CountEO(ar);
		System.out.println(ct[0]);
		System.out.println(ct[1]);
	}
	static int [] CountEO(int [] a)
	{
		int count1=0;
		int count2=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				count1++;
			else
				count2++;
		}
		int c[] = {count1,count2};
		return c;
	}
}
