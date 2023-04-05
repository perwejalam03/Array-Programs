import java.util.Scanner;

public class SmallestEle {
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
	int sm=SmallestE(ar);
	System.out.println(sm);
}
static int SmallestE(int [] a)
{
	int small=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(a[i]<small)
			small=a[i];
	}
	return small;
}
}
