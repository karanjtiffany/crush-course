import java.util.*;

public class Sample56 {

	public static void main(String[] args) {
		TreeMap hm = new TreeMap();// doesn't allow duplicate keys and follow ascending order
		hm.put(12, "Aamira");
		hm.put(14, "Muya");
		hm.put(16, "Melba");
		hm.put(18, "Natasha");
		hm.put(14,"Surya");
		
		Set s =hm.keySet();// keyset gets set of keys 
		Iterator itr = s.iterator();
		while(itr.hasNext())
		{
			Object o = itr.next();
			System.out.println(0+"---"+hm.get(o));
		}
	}

}
