//input output package
import java.io.*;
public class Sample63 {
	public static void main(String[] args) throws IOException
	{
		File obj = new File("c:/Test/data.txt");
		//obj.mkdir();
		//obj.createNewFile();
		//obj.delete();
		
		FileOutputStream fos = new FileOutputStream(obj);
		byte arr[] = {65,66,67,68};
		fos.write(arr);
		fos.close();
	}
}
