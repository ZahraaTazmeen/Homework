package hw7JavaVariablesDecleared;

public class AboutUs {

	public boolean blackHair;

	public String firstName;
	public int myAge;
	public char myGender;
	public boolean fullTimeStudent;
	public byte myPets;
	public short myBirthYear;
	public long myBirthMonth;
	public float siblings;
	public double myBirthday;

	public AboutUs() {
		System.out.println(":------------ This is all about Us ------------:");
	} // the constructor is declared and initialized

	public void aboutUs() {
		System.out.println("First name: " + firstName + "\nMy age: " + myAge + "\nMy gender: " + myGender
				+ "\nFull time student: " + fullTimeStudent + "\nNumber of pets: " + myPets + "\nMy birthyear: "
				+ myBirthYear + "\nMy birth month: " + myBirthMonth + "\nSiblings: " + siblings + "\nMy birthday: "
				+ myBirthday);
	} // the method is implemented and initialized

}
