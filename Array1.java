import java.util.Scanner;
public class Array1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of size in an array:");
		int size=sc.nextInt();
		int [] ar=new int[size];
		System.out.println("Enter " +size+ " values");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("user entered array is:");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}
}
