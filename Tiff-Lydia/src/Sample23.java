// inheritance
class Father //super class
{
	int fproperty = 10;
}
class Son extends Father   //sub class
{
	int sproperty = 5;
	public void buildhome()
	{
		System.out.println(" son can construct a house " +  (sproperty + fproperty)  + " lacs");
	}
}
public class Sample23 {

	public static void main(String[] args) 
	{
		Son obj = new Son();
		obj.buildhome();

	}

}
