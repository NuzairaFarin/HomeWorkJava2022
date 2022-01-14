package hw3Q2JavaVariables;

public class AboutMe {
	// Here Variable is declared but not Initialized.

	public byte myAge;

	// Here variables are initialized.
	public String name = "Nuzaira";
	public byte householdMember = 4;
	public short householdIncome = 32540;
	public int utilities = 45000;
	public long savings = 584848l;
	public float myHeight = 5.1f;
	public double myCgpa = 3.50;
	public char middleName = 'E';
	public boolean voter = false;

	public static void main(String[] args) {

		AboutMe aboutMe = new AboutMe();

		System.out.println("My name is " + aboutMe.name);
		System.out.println("The number of people I live with is " + aboutMe.householdMember);
		System.out.println("Our total household income is in USD " + aboutMe.householdIncome);
		System.out.println("Our utility bills come upto USD " + aboutMe.utilities);
		System.out.println("Total savings that we have is " + aboutMe.savings);
		System.out.println("My height is " + aboutMe.myHeight);
		System.out.println("My High School CGPA is " + aboutMe.myCgpa);
		System.out.println("My middle name is  " + aboutMe.middleName);
		System.out.println("Am I a voter? " + aboutMe.voter);
		System.out.println(aboutMe.name + "\n" + aboutMe.householdIncome);
		System.out.println(aboutMe.myHeight +""+aboutMe.voter);
		System.out.println(aboutMe.middleName +""+ aboutMe.voter);
	}

}
