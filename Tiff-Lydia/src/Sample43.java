
public class Sample43 
{
public static void main(String[] args)
{
	try
	{
		int arr[] = {10,20,30};
		System.out.println(arr[0]+arr[11]+arr[2]);
	}
	catch(ArrayIndexOutOfBoundsException ae)
	{
		System.out.println("index not found");
	}
	finally // optional block
	{
		System.out.println("Hello Aamira");
	}
	}

}
