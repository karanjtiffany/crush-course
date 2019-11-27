
  abstract class trip
  {
	public void add(int a, int t)
	{
		System.out.println(a+t);
	}
	public abstract void display();
}
  class Maldives extends trip
  {
	  public void display()
	  {
		  for(int m=9; m<=12; m++)
			  System.out.println(m);
	  }
  }
  class Bali extends trip
  {
	  public void display()
	  {
		  for(int m=9; m>=1; m--)
			  System.out.println(m);
	  }
  }
public class Assignment3
{

	public static void main(String[] args) 
	{
	Bali obj = new Bali();
	obj.add(9, 21);
	obj.display();

	}

}
