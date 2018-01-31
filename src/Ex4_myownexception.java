
public class Ex4_myownexception {
	public static void test() throws HandlingException
	{
		System.out.println("inside test");
		throw new HandlingException("originated in test");
	}
	
	public static void main(String args[])
	{
		
		int a=6,b=0,c;
		try {
			test();
		}catch(HandlingException ex)
		{
			System.out.println("Inside catch, exception is "+ ex);
		}
	}
}
