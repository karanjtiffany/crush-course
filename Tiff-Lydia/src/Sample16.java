// object oriented programming 
class car
{
	int wipers =2;  // instant  variables are declared inside class
	int steeringwheel =1;
	int sidemirrors =2;
	int horn =1;
	
	public void clear () // functions (methods functions) of the class variable
	{
		System.out.println("car wipers are used to clear windshield");
		
	}
	public void steer()
	{
		System.out.println("car steeringwheel is used to steer");
	}
	public void view()
	{
	    System.out.println("car sidemirrors used to view car surroundings");
	}
	public void alert()
	{
		System.out.println("car horn used to alert");
	}
	}
public class Sample16
{

	public static void main(String[] args) 
	{
		car lexus= new car();
		lexus.clear();
		lexus.steer();
		lexus.view();
		lexus.alert();
		

	}

}
