
public class BiggestMatSmallMat 
{
	public static void main(String[] args) {
		Matrix  m=new Matrix();
		int [][] x=m.readMat();
		System.out.println("User enered matrix is :");
		m.disMat(x);
		int bg=m.biggestMat(x);
		System.out.println("Biggest element in matrix is "+bg);
		
		int sm=m.smallestMat(x);
		System.out.println("Smallest element in matrix is "+sm);
		
	}
}
