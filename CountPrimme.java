
public class CountPrimme
{
	public static void main(String[] args) {
		Matrix  m=new Matrix();
		int [][] x=m.readMat();
		System.out.println("User enered matrix is :");
		m.disMat(x);
		
		int rs=m.CountPrime(x);
		System.out.println("Number of prime number present in matrix is "+rs);
	}
}
