import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class Sample64
{
	public static void main(String[] args) throws IOException
	{
		File obj = new File("c:/Test/data.txt");
		FileInputStream fis = new FileInputStream(obj);
		int ch = 0;
		while ((ch = fis.read())!=-1)
		{
			System.out.print((char)ch);
		}

	}

}
