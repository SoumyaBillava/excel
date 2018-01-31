
public class Ex3ArrayIndexBound {
	public static void main(String args[])
	{
		int a[]= {1,2,3,4,5};
		try {
			for (int i=0;i<10;i++)
				System.out.println(a[i]);
		}catch(Exception ex){
			System.out.println("Exception is "+ex);
			ex.printStackTrace(System.out);
			throw ex;
		}
	}
}
