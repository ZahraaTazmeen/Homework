package hw8JavaConstructor;

public class Student {
	public String stName;
	public int stID;
	public char sex;
	public boolean isProgrammer;
	public Float grade;

	public Student() {
		System.out.println(":------------ This is info for Students ------------:");
	}
	// default constructor declared and initialized here

	public Student(String stName, int stID, char sex, boolean isProgrammer, Float grade) {
		super();
		this.stName = stName;
		this.stID = stID;
		this.sex = sex;
		this.isProgrammer = isProgrammer;
		this.grade = grade;
		System.out.println("Name: " + stName + "\nID: " + stID + "\nSex: " + sex + "\nIs Programmer: " + isProgrammer
				+ "\nGrade: " + grade + "\n");
		// parameterized constructor declared and initialized here
	}
}