import java.util.*;


public class Sample50
{
	public static void main(String[] args) 
	{
		LinkedHashSet obj = new LinkedHashSet();// follows order but doesn't allow duplicates
		obj.add(10);
		obj.add(20);
		obj.add(10);
		obj.add(42);
		obj.add(40);
		obj.add(12);
		obj.add(45);
		obj.add(40);

		System.out.println(obj);
	}
}
