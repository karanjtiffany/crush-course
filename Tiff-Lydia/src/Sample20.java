
public class Sample20
{
	int n;
	public void display(int x)
	{
		n =x;
		for(int i=1;i<=n;i++)
		{
			System.out.println(i);
		}
	}
	public void validatevowel(char x)
	{
		if(x=='a' || x=='e'|| x=='i'|| x=='o'|| x=='u')
			System.out.println("vowel");
		else
			System.out.println("not vowel");
	}

	public static void main(String[] args)
	{
		Sample20 obj= new Sample20();
		obj.display(10);
		obj.display(15);
		obj.validatevowel('i');
		
	}

}
