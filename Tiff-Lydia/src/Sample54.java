import java.util.*;
public class Sample54 
{
 public static void main(String[] args)
 {
		HashMap hm = new HashMap();// doesn't allow duplicate keys and doesn't follow order
		hm.put(12, "Aamira");
		hm.put(14, "Muya");
		hm.put(16, "Melba");
		hm.put(18, "Natasha");
		hm.put(14,"Surya");
		System.out.println(hm.get(12));
		System.out.println(hm.size());
		System.out.println(hm.containsKey(19));
		System.out.println(hm.containsValue("Aamira"));
		hm.remove(18);
		System.out.println(hm);
		
	}

}
