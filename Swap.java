import java.util.Scanner;
public class Swap {
	int [] readArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size=sc.nextInt();
		int [] ar=new int[size];
		System.out.println("enter "+size+ " values");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		return ar;
	}
	void disArray(int [] num) {
		for(int i=0;i<num.length;i++)
		{
			System.out.print(num[i]+" ");
		}
		System.out.println();
	}
	void afterSwap(int [] num)
	{
		int i=0,j=num.length-1;
		while(i<j)
		{
			int temp=num[i];
			num[i]=num[j];
			num[j]=temp;
			i++;
			j--;
		}
	}

}
