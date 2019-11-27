
class add
{
	public void addElements(int a ,int t)
	{
		System.out.println("int value is" +(a +t) );
	}
	public void addElements(float m, float g)
	{
		System.out.println("float value is"+(m+g));
	}
	public void addElements(String country, String name )
	{
		System.out.println("The president of "+country+ "is" +name);
	}
	
}
public class Assignment1 
{

	public static void main(String[] args)
	{
		add first = new add();
		first.addElements(3,5);
		first.addElements(19.45f, 12.23f);
		first.addElements("Kenya", "Uhuru Kenyatta");
	}

}
