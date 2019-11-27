
import java.util.*;

public class Assignment8 {

	public static void main(String[] args) {
		TreeMap hm = new TreeMap();
		hm.put(112, "Aamira");
		hm.put(114, "Muya");
		hm.put(116, "Melba");
		hm.put(118, "Natasha");
		hm.put(114,"Amir");
		
		Set s =hm.keySet();
		Iterator itr = s.iterator();
		while(itr.hasNext())
		{
			Object o = itr.next();
			Object p = hm.get(o);
			String st = (String) p;
			if(st.startsWith("A"))
			System.out.println(o+"---"+p);
		   

		
		}
	}

}



