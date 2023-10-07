package hw6JavaVariablesInitialized;

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

	public AboutMe() {
		System.out.println(":------------ This is all about Myself ------------:");
	}

	public void aboutMe() {
		System.out.println("First name: " + firstName + "\nMy age: " + myAge + "\nMy gender: "
				+ myGender + "\nFull time student: " + fullTimeStudent + "\nNumber of pets: "
				+ myPets + "\nMy birthyear: " + myBirthYear + "\nMy birth month: "
				+ myBirthMonth + "\nSiblings: " + siblings + "\nMy birthday: " + myBirthday);
	}

}
