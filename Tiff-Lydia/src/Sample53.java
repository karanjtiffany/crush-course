
import java.util.*;

public class Sample53
{
	public static void main(String[] args) 
	{
		HashSet obj = new HashSet();
		obj.add(10);
		obj.add(20);
		obj.add(36);
		obj.add(42);
		obj.add(40);
		obj.add(12);
		obj.add(27);
		
		Iterator itr = obj.iterator();
		while(itr.hasNext())
		{
			Object o = itr.next();
			int n = (Integer)o;
			if(n%5==0)
			System.out.println(o);
		}
}

}