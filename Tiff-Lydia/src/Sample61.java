class Table
{
	public synchronized void displaytable(int x) throws InterruptedException
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(x+"*"+i+"="+(x*i));
			Thread.sleep(1000);
		}
	}
}
class Tiffany extends Thread
{
	Table t;
	public Tiffany(Table t)
	{
		this.t = t;
	}
	public void run()
	{
		try {
			t.displaytable(5);
		} catch (InterruptedException e) {
		}
	}
}
class Surya extends Thread
{
	Table t;
	public Surya(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		try {
			t.displaytable(10);
		} catch (InterruptedException e) {
		}
	}
}
public class Sample61 
{
	public static void main(String[] args) 
	{
		Table t = new Table();
		Tiffany t1 = new Tiffany(t);
         t1.start();
         
         Surya t2= new Surya(t);
         t2.start();
	}

}
