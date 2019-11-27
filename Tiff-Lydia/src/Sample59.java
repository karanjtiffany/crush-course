
public class Sample59 extends Thread
{
	public static void main(String[] args)
	{
		Sample59 obj = new Sample59();
		
		System.out.println(obj.getId());
		System.out.println(obj.getName());
		System.out.println(obj.getPriority());
		System.out.println(obj.isAlive());
		System.out.println(obj.getState());
		
		obj.setName("Aamira");
		System.out.println(obj.getName());
		
		obj.setPriority(9);
		System.out.println(obj.getPriority());

	}

}
