package hw5Q2Constructor;

/*public class Computer {
	public String brand;
	public String model;
	public String operatingSystem;
	public int price;
	public char grade;
	public boolean madeInUSA;*/
public class ComputerTest {

	public static void main(String[] args) {
		Computer computer = new Computer();
		Computer computer01 = new Computer("Apple,", "MacBook Air,", "MacOS Mojave,", 800, 'A', false);
		Computer computer02 = new Computer("Lenovo,", "Yoga 7i,", "Windows 11 Home 64,", 1200, 'A', false);

	}

}
