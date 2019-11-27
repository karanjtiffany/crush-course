// method overriding

class Blackwhitetv
{
	public void watchmovie()
	{
		System.out.println("can watch movie in black white");
	}
}

class Colortv extends Blackwhitetv
{
	public void watchmovie()
	{
		super.watchmovie();
		System.out.println("can watch movie in color");
	}
}

public class Sample25 {

	public static void main(String[] args)
	{
	   Colortv obj =new Colortv();
	   obj.watchmovie();

	}

}
