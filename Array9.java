import java.util.Scanner;
public class Array9 {
	
	static int poscount(int [] num)
	{
		int count=0;
		for(int i=0;i<num.length;i++)
		{
			if(num[i]>0)
				count++;
		}
		return count;
	}
	static int negcount(int [] num)
	{
		int count1=0;
		for(int i=0;i<num.length;i++)
		{
			if(num[i]<0)
				count1++;
		}
		return count1;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size=sc.nextInt();
		int [] ar=new int[size];
		System.out.println("enter "+size+ " value");
		for(int i=0;i<size;i++)
		{
			ar[i]=sc.nextInt();
		}
		int count=poscount(ar);
		System.out.println("The positive element is " +count);
		int count1=negcount(ar);
		System.out.println("The negative element is "+count1);
	}
	

}
