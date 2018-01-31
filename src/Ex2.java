
public class Ex2 {
	public static void main(String args[])
	{
		Ex1_Trycatch ref = null;
		try
		{
			ref.printing();
		}catch(Exception ex){
			System.out.println("This is a null pointer exception");
		}
		
	}
}
