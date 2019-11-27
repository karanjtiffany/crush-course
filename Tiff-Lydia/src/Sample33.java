// Buffer
public class Sample33 
{

	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer("Welcome to java ");
		sb.append(" muya ");
		System.out.println(sb);
		sb.insert(8, "surya  ");
		System.out.println(sb);
		System.out.println(sb.charAt(0));
		System.out.println(sb.length());
		sb.deleteCharAt(0);
		System.out.println(sb);
		sb.delete(0, 6);
		System.out.println(sb);
		sb.replace(1, 6, "satya");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		
	}

}
