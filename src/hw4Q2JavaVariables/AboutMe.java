package hw4Q2JavaVariables;


public class AboutMe {


	public String MyName;
	public byte yearsInUsa;
	public float height;
	public char sex;
	public double cgpa;
	public short taxPaid;
	public int totalEarning;
	public long bankBalance;
	public boolean voter;

	public AboutMe() {
		System.out.println("This is all about me:");

	}

	public void aboutMe() {
		System.out.println("My name: " + MyName + "\nResident for: " + yearsInUsa + "\nHeight: " + height + "\nSex: "
				+ sex + "\nHigh school score: " + cgpa + "\nTotal tax:" + taxPaid + "\nTotal income: " + totalEarning
				+ "\nCurrent bank balance: " + bankBalance + "\nAm I a voter: "+voter);
	}
}
