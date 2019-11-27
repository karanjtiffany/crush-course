
interface Animal
{
	public void Talk();
}
class Dog implements Animal
{
	public void Talk()
	{
		System.out.println("Bingo is a dog that talks!");
	}
}
class Goat implements Animal
{
	public void Talk()
	{
		System.out.println("Astro is a goat that talks!");
	}
}
class Hen implements Animal
{
	public void Talk()
	{
		System.out.println("Jane's pet is a hen that can talk.");
	}
}

public class Asssignment4
{

	public static void main(String[] args) 
	{
		Dog Bingo = new Dog();
		Bingo.Talk();
		
		Goat Astro =  new Goat();
		Astro.Talk();
		
		Hen Kifaranga = new Hen();
		Kifaranga.Talk();
	}

}
