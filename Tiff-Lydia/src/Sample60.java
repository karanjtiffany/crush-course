
public class Sample60 extends Thread // thread lightweight process that performs a unit of work
{
	public void run()
	{
		for (int i=1;i<=10;i++)
		{
			System.out.println(i+"---"+Thread.currentThread().getName());
			try
			{
				Thread.sleep(1000);
			}
					catch (InterruptedException e)
			{
				}
				
			}
		}
	
	public static void main(String[] args) throws InterruptedException 
	{
		Sample60 obj = new Sample60();
		Sample60 obj1 = new Sample60();
		Sample60 obj2 = new Sample60();
		obj.setName("AamiraThread");
		obj1.setName("MelbaThread");
		obj2.setName("MuyaThread");
		obj.start();
		obj1.start();
		obj1.join();
		obj2.start();

	}

}
