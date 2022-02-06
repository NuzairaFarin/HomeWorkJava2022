package hw6Q2IfElseCondition;

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
