package hw13Abstraction;

public abstract class MedicalSchool {

	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("This is the biochemistry lab method");
	}

	public MedicalSchool() {

	}
}

/*
 * One keyword is used for inheritance in Java for abstract classes. 
 * An abstract class can inherit another abstract class or a regular class but not an Interface by extends keyword.
 * An abstract class can inherit only an abstract or a regular class once.
 */