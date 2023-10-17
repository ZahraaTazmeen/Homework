package hw11UseOfSuperInChildClass;

public class Father {
	public String name;
	public int age;
	public char gender;
	public boolean usCitizen;
	public String familyName;

	public Father() {
		System.out.println("From Parent Class, this is the Father default constructor");
	}

	public Father(String name, int age, char gender, boolean usCitizen, String familyName) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.usCitizen = usCitizen;
		this.familyName = familyName;
		System.out.println("From Parent Class, this is the Father parameterized constructor");
	}

	public void father() {
		System.out.println("From Parent Class, this is the default father void type method");
	}

	public void father(String name, int age, char gender, boolean usCitizen, String familyName) {
		System.out.println("From Parent Class, this is the parameterized father void type method");
	}
}
