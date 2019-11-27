
public class Assignment6
{
	public static void main(String[] args)
	{
	try
	{
		int x =9, y=9;
		System.out.println(x/y);
		
		int a =Integer.parseInt("418");
		System.out.println(a+2);
		
		String str ="Aamira";
		System.out.println(str.charAt(4));
		
		int arr[] = {9,18,19};
		System.out.println(arr[0]+arr[1]+arr[2]);	
		
		String t = null;
		System.out.println(t.length());
	}
	catch(ArithmeticException ae)
	{
	System.out.println("number not didvisible by zero");
	}
	catch (NumberFormatException ne)
	{
		System.out.println("can not convert to integer");
	}
	catch (StringIndexOutOfBoundsException se)
	{
		System.out.println("string is out of range");
	}
	catch (ArrayIndexOutOfBoundsException ae )
	{
		System.out.println("arry is out of bound");
	}
	catch (NullPointerException ne)
	{
		System.out.println("null cannot output");
	}

}
}
