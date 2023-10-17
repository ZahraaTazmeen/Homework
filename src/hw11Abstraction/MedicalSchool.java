package hw11Abstraction;

public abstract class MedicalSchool extends NursingSchool implements LawSchool,College, Hospital{

	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("This is the biochemistry lab method");
	}

	public MedicalSchool() {

	}
}
/*
 * Two keywords are used for inheritance in Java for Abstract Class, "implements" and "extends". 
 * An abstract class can inherit an abstract or regular class with the extends keyword and the implements 
 * keyword, if you use override method, and inherit Interfaces with the implements keyword.
 * One "extends" inheritance and more than one "implements" inheritances for Interface are possible in an abstract class. 
 */
 