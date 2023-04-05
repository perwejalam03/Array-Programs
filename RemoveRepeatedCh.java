import java.util.Arrays;
import java.util.Scanner;

public class RemoveRepeatedCh {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String st=sc.nextLine();
		boolean [] b=new boolean[st.length()];
		String str="";
		for(int i=0;i<st.length();i++)
		{
			if(b[i]==false)
			{
				for(int j=i+1;j<st.length();j++)
				{
					if(st.charAt(i)==st.charAt(j))
					{
						b[j]=true;
						b[i]=true;
					}
				}
				if(b[i]==true)
				{
					str=str+st.charAt(i);
				}
			}
		}
		System.out.println(str);
	}
}
