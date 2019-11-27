import java.io.Serializable;

public class Student implements Serializable
{
String studentname;
int studentid;
int studentyear;
int studentage;
String studentdegree;
public String getStudentname() {
	return studentname;
}
public void setStudentname(String studentname) {
	this.studentname = studentname;
}
public int getStudentid() {
	return studentid;
}
public void setStudentid(int studentid) {
	this.studentid = studentid;
}
public int getStudentyear() {
	return studentyear;
}
public void setStudentyear(int studentyear) {
	this.studentyear = studentyear;
}
public int getStudentage() {
	return studentage;
}
public void setStudentage(int studentage) {
	this.studentage = studentage;
}
public String getStudentdegree() {
	return studentdegree;
}
public void setStudentdegree(String studentdegree) {
	this.studentdegree = studentdegree;
}
}
