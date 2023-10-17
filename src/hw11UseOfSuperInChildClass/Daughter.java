package hw11UseOfSuperInChildClass;

public class Daughter extends Father {
	public String birthMonth;
	public int age;

	public Daughter() {
		super();
		System.out.println("This is the Daughter default constructor");
	}

	public Daughter(String birthMonth, int age) {		
		super();
		super.familyName = "Sharkar";
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("This is the Daughter parameterized constructor");
		System.out.println("Last Name: "+ familyName);
	}

	public void daughter() {
		super.familyName = "Johnson";
		System.out.println("This is the default daughter void type method");
		System.out.println("Last Name: "+ familyName);
	}

	public void daughter(String birthMonth, int age) {
		System.out.println("This is the parameterized daughter void type method");
	}
}
