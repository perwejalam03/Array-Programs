import java.util.Scanner;
public class Array2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size=sc.nextInt();
		int [] ar=new int[size];
		System.out.println("Enter "+ size+ " values");
		for(int i=0;i<ar.length;i++)
			ar[i]=sc.nextInt();
		System.out.println("The reverse order of an array is");
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.print(ar[i]+ " ");
		}
	}
}
