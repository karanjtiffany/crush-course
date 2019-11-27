
public class Sample37 
{

	public static void main(String[] args)
	{
		try
		{
			int x=10, y=0;
			System.out.println(x/y);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Number cannot divisible by zero");
		}
		
		
				
	}

}
