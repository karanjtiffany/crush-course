
 public class Assignment5 
 {
 public static void main(String[] args)
 {
		String str = new String ("We23LCo5amE4"); 
		int uppercase =0,  lowercase= 0, digits= 0;
		for (int i=0;i<str.length();i++)
		{
			if(Character.isUpperCase(str.charAt(i)))
			{
				uppercase++;
			}
			else if(Character.isLowerCase(str.charAt(i)))
			{
				lowercase++;
			}
			else if(Character.isDigit(str.charAt(i)))
			{
				digits++;
			}
			
		}
		System.out.println(uppercase);
		System.out.println(lowercase);
		System.out.println(digits);
	}

}
