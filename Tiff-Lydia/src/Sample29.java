interface shape1
{
	public void area();
}

interface shape2
{
	public void perimeter();
}

class Rectangle implements shape1
{
	public void area()
	{
		int l=98, w=60;
	}
}
class Circle implements shape2
{
	public void perimeter()
	{
		float pi=3.14f, rad= 6.2f;
		System.out.println(2*pi*rad);
	}
}
public class Sample29 {

	public static void main(String[] args) 
	{
		Circle c =new Circle();
		c.perimeter();
		
		Rectangle r= new Rectangle();
		r.area();
	}

}
