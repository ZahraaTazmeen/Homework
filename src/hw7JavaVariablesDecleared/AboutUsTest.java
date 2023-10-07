package hw7JavaVariablesDecleared;

public class AboutUsTest {

	public static void main(String[] args) {
		AboutUs zahraa = new AboutUs();
		zahraa.firstName = "Zahraa"; // a variable is declared and initialized
		zahraa.myAge = 15; // a variable is declared and initialized
		zahraa.myGender = 'f'; // a variable is declared and initialized
		zahraa.fullTimeStudent = true; // a variable is declared and initialized
		zahraa.myPets = 0; // a variable is declared and initialized
		zahraa.myBirthYear = 2008; // a variable is declared and initialized
		zahraa.myBirthMonth = 6; // a variable is declared and initialized
		zahraa.siblings = 1; // a variable is declared and initialized
		zahraa.myBirthday = 25; // a variable is declared and initialized
		zahraa.aboutUs();

		AboutUs alex = new AboutUs();
		alex.firstName = "Alex"; // a variable is declared and initialized
		alex.myAge = 21; // a variable is declared and initialized
		alex.myGender = 'M'; // a variable is declared and initialized
		alex.fullTimeStudent = false; // a variable is declared and initialized
		alex.myPets = 1; // a variable is declared and initialized
		alex.myBirthYear = 2002; // a variable is declared and initialized
		alex.myBirthMonth = 4; // a variable is declared and initialized
		alex.siblings = 2; // a variable is declared and initialized
		alex.myBirthday = 7; // a variable is declared and initialized
		alex.aboutUs();
	}
}