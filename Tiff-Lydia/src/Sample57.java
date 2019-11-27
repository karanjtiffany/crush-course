import java.util.*;
public class Sample57 
{
	public static void main(String[] args) 
	{
		String s = "Welcome-to-java-world";
		
		StringTokenizer st = new StringTokenizer(s,"-");
		System.out.println(st.countTokens());
		
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}

}
