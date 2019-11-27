
public class Sample36 
{
	public static void main(String[] args)
	{
		String str = new String("mos3e7s4");
		
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				System.out.println(str.charAt(i));
			}
			else if(Character.isLowerCase(str.charAt(i)))
			{
				System.out.println(str.charAt(i));
			}
		}

	}

}
