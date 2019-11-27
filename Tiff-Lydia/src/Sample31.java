
public class Sample31
{

	public static void main(String[] args)
	{
		String obj = new String ("My daughters name is Aamira");
		for (int i=0;i<obj.length();i++)
		{
			if(obj.charAt(i)=='a' || obj.charAt(i)=='e' || obj.charAt(i)=='i' || obj.charAt(i)=='o' || obj.charAt(i)=='u' )
			System.out.println(obj.charAt(i));
	 }
		System.out.println();
		for(int A=obj.length()-1;A>=0;A--)
		{
			System.out.print(obj.charAt(A));
		}
	}

}
