import java.util.Scanner;
public class SearchEle
{
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
	int Search(int [] ar,int ele)
	{
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==ele)
				return i;
		}
		return -1;
	}

}
