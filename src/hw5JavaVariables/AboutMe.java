package hw5JavaVariables;

public class AboutMe {

	public boolean blackHair;
	public String firstName = "Zahraa";
	public int myAge = 15;
	public char myGender = 'F';
	public boolean fullTimeStudent = true;
	public byte myPets = 0;
	public short myBirthYear = 2008;
	public long myBirthMonth = 6;
	public float siblings = 1.0f;
	public double myBirthday = 25;

	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe();
		System.out.println("First name: " + aboutMe.firstName + "\nMy age: " + aboutMe.myAge + "\nMy gender: "
				+ aboutMe.myGender + "\nFull time student: " + aboutMe.fullTimeStudent + "\nNumber of pets: "
				+ aboutMe.myPets + "\nMy birthyear: " + aboutMe.myBirthYear + "\nMy birth month: "
				+ aboutMe.myBirthMonth + "\nSiblings: " + aboutMe.siblings + "\nMy birthday: " + aboutMe.myBirthday);
	}
}
