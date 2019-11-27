abstract class Natural
{
	public void add(int x, int y)
	{
		System.out.println(x+y);
	}
	public abstract void display();  //abstract method----without body
}
class Muya extends Natural
{
	public void display()
	{
		for(int i=1; i<=10;i++)
			System.out.println(i);
	}
}
class Moses extends Natural
{
	public void display()
	{
		for(int i=10; i>=1;i--)
			System.out.println(i);
	}
	
}
public class Sample27 {

	public static void main(String[] args)
	{
	  Moses obj =new Moses();
	  obj.add(10, 20);
	  obj.display();
	}

}
