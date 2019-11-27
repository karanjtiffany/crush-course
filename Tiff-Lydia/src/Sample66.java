import java.io.*;
public class Sample66 {

	public static void main(String[] args) throws IOException
	{
		File obj = new File("c:/Test/data.txt");
		FileInputStream fis = new FileInputStream(obj);
		DataInputStream dis = new DataInputStream(fis);
		System.out.println(dis.readInt());
		System.out.println(dis.readFloat());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readUTF());
	}

}
