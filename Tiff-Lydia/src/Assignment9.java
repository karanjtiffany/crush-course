class Flower
{
	public synchronized void displayflower(int x) throws InterruptedException 
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(x+"*"+i+"="+(x*i));
			Thread.sleep(1000);
		}
	}
}
class Sunflower extends Thread
{
	Flower s;
	public Sunflower(Flower s)
	{
		this.s = s;
	}
	public void run()
	{
		try {
			s.displayflower(12);
		} catch (InterruptedException e) {
		}
	}
	
		
	}

class Roses extends Thread
{
	Flower s;
	public Roses(Flower s)
	{
		this.s=s;
	}
	public void run()
	{
		try {
			s.displayflower(24);
		} catch (InterruptedException e) {
		}
	}
}
public class Assignment9
{
	public static void main(String[] args) 
	{
		Flower s = new Flower ();
		Sunflower s1 = new Sunflower(s);
         s1.start();
         
         Roses s2= new Roses(s);
         s2.start();
	}

}




