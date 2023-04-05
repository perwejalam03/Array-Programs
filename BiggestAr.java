import java.util.Scanner;

public class BiggestAr {
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
	int bg=BiggestAr(ar);
	System.out.println(bg);
}
	static int BiggestAr(int [] a)
	{
		int big=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(big<a[i])
				big=a[i];
		}
		return big;
	}
}
