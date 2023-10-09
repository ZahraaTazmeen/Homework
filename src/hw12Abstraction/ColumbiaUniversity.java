package hw12Abstraction;

public class ColumbiaUniversity {

	// public abstract void chemistry();
	// This is not possible because the class is regular and not abstract.
	// If the class is not abstract, the method is not defined/declared.

	public void biology() {
		System.out.println("This is the biology method");
	}

	public ColumbiaUniversity() {
	}

}

/*
 * One keyword is used for inheritance in Java for a regular Class. 
 * A regular class can inherit another regular class or a abstract class but not an Interface by extends keyword. 
 * A regular class can inherit only an abstract or a regular class once.
 */