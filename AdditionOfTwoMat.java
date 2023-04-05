
public class AdditionOfTwoMat
{
	public static void main(String[] args) {
		Matrix  m=new Matrix();
		System.out.println("Read first matrix ");
		int [][] x=m.readMat();
		System.out.println("Read second matrix ");
		int [][] y=m.readMat();
		
		System.out.println("User enered first matrix is :");
		m.disMat(x);
		System.out.println("User entered second matrix is ");
		m.disMat(y);
		
		int [][] z=m.addMat(x, y);
		if(z==null)
			System.out.println("Addition failed ");
		else
			System.out.println("Added matrix is ");
			m.disMat(z);
		
	}
}
