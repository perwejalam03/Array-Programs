import java.util.Scanner;
public class Array4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int [] ar=new int[size];
		System.out.println("Enter "+size+ " values");
		for(int i=0;i<ar.length;i++)
			ar[i]=sc.nextInt();
		int bg=biggestof(ar);
		System.out.println("The biggest element is "+bg);
	}
	static int biggestof(int [] num)
	{
		int big=num[0];
		for(int i=0;i<num.length;i++)
		{
			if(num[i]>big)
				big=num[i];
		}
		return big;
	}
}
