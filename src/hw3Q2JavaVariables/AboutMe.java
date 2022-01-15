package hw3Q2JavaVariables;

public class AboutMe {
	// Here Variable is declared but not Initialized.

	public byte myAge;

	// Here variables are initialized.
	public String MyName = "Nuzaira";
	public byte yearsInUsa = 4;
	public short taxPaid = 32540;
	public int totalEarning = 45000;
	public long bankBalance = 584848l;
	public float height = 5.1f;
	public double cgpa = 3.50;
	public char sex = 'f';
	public boolean voter = false;

	public static void main(String[] args) {

		AboutMe aboutMe = new AboutMe();

		System.out.println("My name is " + aboutMe.MyName);
		System.out.println("I have been living in the USA for " + aboutMe.yearsInUsa + "years.");
		System.out.println("Last year the total tax amount I paid was " + aboutMe.taxPaid);
		System.out.println("Our total earning for the last year was $" + aboutMe.totalEarning);
		System.out.println("Total savings that we have is " + aboutMe.bankBalance);
		System.out.println("My height is " + aboutMe.height);
		System.out.println("My High School CGPA is " + aboutMe.cgpa);
		System.out.println("Sex:  " + aboutMe.sex);
		System.out.println("Am I a voter? " + aboutMe.voter);
	}

}
