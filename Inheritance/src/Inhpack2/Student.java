package Inhpack2;

public class Student extends Person{

private int gradYear;
private String courseName;
private double fees;
private int marks;
public Student(String fn, String ln, int yr, String crs, int fe, int mrk) {
	
	// TODO Auto-generated constructor stub
	super(fn,ln);
	gradYear=yr;
	courseName=crs;
	fees=fe;
	marks=mrk;
	//System.out.println("year"+yr+"course"+crs+"fees"+fe+"marks"+mrk);
	//System.out.println("fname"+fn+"lname"+ln+"year"+yr+"course"+crs+"fees"+fe+"marks"+mrk);
	System.out.println("2");
}
}
