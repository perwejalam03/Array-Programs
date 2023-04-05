import java.util.Scanner;
public class Array5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array ");
		int size=sc.nextInt();
		int [] ar=new int[size];
		System.out.println("Enter "+size+ " values");
		for(int i=0;i<ar.length;i++)
			ar[i]=sc.nextInt();
		int[] count=countofEO(ar);
		System.out.println("The number of even element present in an array is "+count[0]);
		System.out.println("The number of odd element present in an array is "+count[1]);
	}
	/*static int[] countofEO(int [] num)
	{
		int ec=0,oc=0;
		for(int i=0;i<num.length;i++)
		{
			if(num[i]%2==0)
				ec++;
			else
				oc++;
		}
		int [] count= {ec,oc};
	return count;
	}*/
	static int [] countofEO(int [] num)
	{
		int [] count= {0,0};
		for(int i=0;i<num.length;i++)
		{
			count[num[i]%2]++;
		}
		return count;
	}
}
