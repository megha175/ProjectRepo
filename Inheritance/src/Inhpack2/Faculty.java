package Inhpack2;

public class Faculty extends Person{

	
	
	private int yrsofExp;
	private String sme;
	public Faculty(String fn1, String ln1, int exp, String expert) {
		// TODO Auto-generated constructor stub
		super(fn1,ln1);
		yrsofExp=exp;
		sme=expert;
		System.out.println("3");
		//System.out.println("fname"+fn1+"lname"+ln1+"experience"+yrsofExp+"subject matter expertise"+sme);
	}
}
