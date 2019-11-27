import java.io.*;
public class Sample67
{
	public static void main(String[] args) throws IOException
	{
		File obj = new File("c:/Test/data.txt");
        FileOutputStream fos = new FileOutputStream(obj);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        Student st = new Student();
        st.setStudentname("Tiffany Karanja");
        st.setStudentid(1947);
        st.setStudentyear(3);
        st.setStudentage(19);
        st.setStudentdegree("Biology");
        
        oos.writeObject(st);
        oos.close();
        fos.close();
        
	}

}
