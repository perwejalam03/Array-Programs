import java.util.Scanner;
public class MainArray {
	public static void main(String[] args) {
		Array8 a=new Array8();
		int [] x= a.readArray();
		
		System.out.println("User entered Array");
		a.dispArray(x);
		
		//int pc=a.countprime(x);
		//System.out.println("number of prime numbers:"+pc);
		
		a.sumofDigit(x);
		System.out.println("After updated array is:");
		
		a.dispArray(x);
		
		/*Swap s=new Swap();
		int [] x= s.readArray();
		
		System.out.println("User entered array ");
		s.disArray(x);
		
	
		s.afterSwap(x);
		System.out.print("After swaping ");
		s.disArray(x);
		
		/*MergeArray m=new MergeArray();
		System.out.println("Enter first array:");
		int [] x=m.readArray();
		
		System.out.println("Enter second array:");
		int [] y=m.readArray();
		
		m.disArray(x);
		m.disArray(y);
		
		int [] c=m.merge(x, y);
		
		//m.merge(x,x);
		System.out.println("After merge two array ");
		
		m.disArray(c);
		*/
		
		/*MergeZigzag m=new MergeZigzag();
		System.out.println("Enter first array:");
		int [] x=m.readArray();
		
		System.out.println("Enter second array:");
		int [] y=m.readArray();
		
		m.disArray(x);
		m.disArray(y);
		
		int [] c=m.mergeZigzag(x, y);
		
		//m.merge(x,x);
		System.out.println("After merge two array ");
		
		m.disArray(c);*/
		
		/*InsetArray a=new InsetArray();
		
		int[] x=a.readArray();
		System.out.println("User intered array:");
		
		a.disArray(x);
		x=a.insertArr(x,39,2);
		System.out.println("After insert:");
		a.disArray(x);*/
		
		/*DeleteArray d=new DeleteArray();
		
		int [] x= d.readArray();
		System.out.println("User entered array is:");
		d.disArray(x);
		
		x=d.deleteArr(x, 2);
		System.out.println("After deleted array is:");
		d.disArray(x);*/
		
		/*SearchEle s=new SearchEle();
		int [] a=s.readArray();
		System.out.println("User entered array:");
		s.disArray(a);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value to search:");
		int ele=sc.nextInt();
		int in=s.Search(a,ele);
		if(in==-1)
			System.out.println("element is not present");
		else
			System.out.println("Element is present"+in);*/
		
//		FrequencyEle f=new FrequencyEle();
//		int [] x=f.readArray();
//		System.out.println("User entered array:");
//		f.disArray(x);
//		System.out.println("Check frequency");
//		f.Frequency(x);
	}
}
																																																																																																																																																																																																														