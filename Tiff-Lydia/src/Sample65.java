import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Sample65
{
	public static void main(String[] args) throws IOException
	{
		File obj = new File("c:/Test/data.txt");
		FileOutputStream fos = new FileOutputStream(obj);
		DataOutputStream dos = new DataOutputStream(fos);
		dos.write(100);
		dos.writeFloat(4.5f);
		dos.writeBoolean(false);
		dos.writeUTF("Aamira");
		dos.close();
		dos.close();
	}
}
