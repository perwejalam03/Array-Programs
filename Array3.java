import java.util.Scanner;
public class Array3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int [] ar=new int[size];
		for(int i=0;i<ar.length;i++)
			ar[i]=sc.nextInt();
		int sm=sumofArray(ar);
		System.out.println("Sum of the array is"+sm);
		
	}
	static int sumofArray(int [] num)
	{
		int sum=0;
		for(int i=0;i<num.length;i++)
		{
			sum=sum+num[i];
		}
		return sum;
	}
}
