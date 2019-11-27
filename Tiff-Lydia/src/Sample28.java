interface Add // interface contains only abstract methods
{
	public void addnumbers(int a, int t);
}
class AA implements Add
{
	public void addnumbers(int a, int t)
	{
		System.out.println(a+t);
	}
	
}
class BB implements Add
{
	public void addnumbers(int a ,int t)
	{
		int s = 0;
		for(int i=a;i<=t;i++)
		{
			s+=i;
		}
		System.out.println(s);
	}
}

public class Sample28 
{

	public static void main(String[] args) 
	{
	AA obj = new AA();
	obj.addnumbers(12, 22);
	
	BB obj1 = new BB();
	obj1.addnumbers(9,18);
	}
}
