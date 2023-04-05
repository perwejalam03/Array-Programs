import java.util.Scanner;
public class Array6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int [] ar=new int[size];
		System.out.println("Enter "+size+ " values");
		for(int i=0;i<ar.length;i++)
			ar[i]=sc.nextInt();
		int sm=smallestof(ar);
		System.out.println("The smallest element is "+sm);
	}
	static int smallestof(int [] num)
	{
		int small=num[0];
		for(int i=0;i<num.length;i++)
		{
			if(num[i]<small)
				small=num[i];
		}
		return small;
	}
}
