package hw6Q2IfElseCondition;

/*2) Create a package name --> "hw6Q2IfElseCondition" inside your HW project. 
 * Create a Class, name "Voter". Type the main method. 
 * After the main method, define a int type variable age and initialize your age. 
 * Now write some condition. 
 * a) your age is equal to 18, outcome will be "I am a Voter" 
 * b) your age is less than 18, outcome will be "I am not a Voter 
 * c) your age is greater than 18 or equal to 18 , 
 * outcome will be "I am a Voter (>=) d) 
 * And finally the outcome will be "Please add a valid age". 
 * In the above 4 condition, 
 * use appropriate key word like if, else if, else to execute that you are a voter or not*/
public class Voter {

	public static void main(String[] args) {

		int myAge = 23;
		int age1 = 18;

		if (myAge == age1) {
			System.out.println("I am a Voter.");
		} else if (myAge < age1) {
			System.out.println("I am not a Voter.");
		} else if (myAge >= age1) {
			System.out.println("I am a Voter.");
		} else {
			System.out.println("Please add a valid age.");
		}
	}

}
