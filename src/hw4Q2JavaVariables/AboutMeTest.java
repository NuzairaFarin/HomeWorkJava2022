package hw4Q2JavaVariables;


public class AboutMeTest {

	public static void main(String[] args) {

		AboutMe candidate1 = new AboutMe();
		candidate1.MyName = "Nuzaira";
		candidate1.yearsInUsa = 2;
		candidate1.height = 5.1f;
		candidate1.sex = 'F';
		candidate1.cgpa = 4.50;
		candidate1.taxPaid = 31700;
		candidate1.totalEarning = 4867660;
		candidate1.bankBalance = 69886998654l;
		candidate1.voter = false;
	//	candidate1.aboutMe();

		System.out.println("\n*******************************************************");

		AboutMe candidate2 = new AboutMe();
		candidate2.MyName = "Michael";
		candidate2.yearsInUsa = 10;
		candidate2.height = 5.11f;
		candidate2.sex = 'M';
		candidate2.cgpa = 3.80;
		candidate2.taxPaid = 28799;
		candidate2.totalEarning = 344600;
		candidate2.bankBalance = 54667877l;
		candidate2.voter = true;
/*		candidate2.aboutMe(); Here the aboutMe is here to print out the method
 from the class AboutMe from line 22 to line 25.
*/
	}

}
