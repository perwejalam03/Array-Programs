import java.util.Scanner;
public class FrequencyEle {
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
	void Frequency(int [] ar)
	{
		boolean [] b=new boolean[ar.length];
		for(int i=0;i<ar.length;i++)
		{
			if(b[i]==false)
			{
				int count=1;
				for(int j=i+1;j<ar.length;j++)
				{
					if(ar[i]==ar[j])
					{
						count++;
						b[j]=true;
					}
				}
				System.out.println(ar[i]+ "--> " +count );
			}
		}
	}

}
