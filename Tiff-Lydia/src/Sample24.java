class First
{
	int x=10, y=20;
	public void add()
	{
		System.out.println(x+y);
	}
}
class Second extends First
{
	public void sub()
	{
		System.out.println(y-x);
	}
}
public class Sample24 
{

	public static void main(String[] args)
	{
		Second obj = new Second();
		obj.add();
		obj.sub();
	}

}
