import java.util.HashSet;// doesn't follow order and doesn't duplicate


public class Sample49
{
	public static void main(String[] args) 
	{
		HashSet obj = new HashSet();
		obj.add(10);
		obj.add(20);
		obj.add(10);
		obj.add(42);
		obj.add(40);
		obj.add(12);
		obj.add(45);
		obj.add(40);
		
		System.out.println(obj);
		System.out.println(obj.size());
		System.out.println(obj.contains(10));
		System.out.println(obj.isEmpty());
		obj.remove(40);
		System.out.println(obj);
}

}


