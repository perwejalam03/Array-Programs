import java.util.Scanner;
public class Array7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size=sc.nextInt();
		int [] ar=new int[size];
		System.out.println("enter "+size+ "values");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		int smEO=sumofEO(ar);
		System.out.println("The even sum is "+smEO);
		System.out.println("THe odd sum is "+smEO);
	}
	static int sumofEO(int [] num)
	{
		int sum=0;
		for(int i=0;i<num.length;i++)
		{
			if(num[i]%2==0)
				sum=sum+num[i];
		}
		return sum;
	}

}
