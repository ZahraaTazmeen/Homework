package hw7JavaConstructor;

public class Student {
	public String stName;
	public int stID;
	public char sex;
	public boolean isProgrammer;
	public Float grade;

	public Student() {
		System.out.println(":------------ This is info for Students ------------:");
	}

	public Student(String stName) {
		System.out.println("My Name: " + stName);
	}
}