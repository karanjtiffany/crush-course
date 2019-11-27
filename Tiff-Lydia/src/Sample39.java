
public class Sample39 
{
	public static void main(String[] args)
	{
		try
		{
			String s =null;
			System.out.println(s.length());
		}
		catch(NullPointerException ne)
		{
			System.out.println("null cannot output");
		}
		
		

	}

}
