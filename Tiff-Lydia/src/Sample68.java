import java.io.*;
public class Sample68 {

	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		File obj = new File("c:/Test/data.txt");
		FileInputStream fos = new FileInputStream(obj);
		ObjectInputStream oos = new ObjectInputStream(fos);
		
		Student st = (Student)oos.readObject();
        System.out.println(st.getStudentname());
        System.out.println("Student ID number" + st.getStudentid());
        System.out.println("School year" + st.getStudentyear());
        System.out.println("Student age" + st.getStudentage());
        System.out.println("Student major" + st.getStudentdegree());
        oos.close();
        fos.close();
	}

}
