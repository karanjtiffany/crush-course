import java.util.HashMap;

public class Sample55 
{
	public static void main(String[] args)
	{
		LinkedHashMap hm = new LinkedHashMap();// doesn't allow duplicate keys and  follows order
		hm.put(12, "Aamira");
		hm.put(14, "Muya");
		hm.put(16, "Melba");
		hm.put(18, "Natasha");
		hm.put(14,"Surya");
	}

}
