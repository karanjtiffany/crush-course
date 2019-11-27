
public class Sample35 
{

	public static void main(String[] args)
	{
		String user = "apple";
		String pwd = "elppa";
		
		StringBuffer sb = new StringBuffer(pwd);
		StringBuffer sb1 = sb.reverse();
		
		if(user.contentEquals(sb1.toString()))
			System.out.println("login success");
		else
			System.out.println("login failed");
		
	}

}
