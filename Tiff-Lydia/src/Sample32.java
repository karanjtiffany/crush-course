
public class Sample32 
{

	public static void main(String[] args)
	{
		String usr ="WELtiffany";
		String pwd = "hello";
		String cpwd ="hello";
		
		if(usr.startsWith("WEL") && usr.length()>4 && pwd.equals(cpwd) && usr.contains("@"))
		{
		System.out.println("login success");
		}
		else
		{
			System.out.println("login failed");
		}
	}
	
	

}
