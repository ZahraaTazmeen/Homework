package hw11Abstraction;

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool{

	// public abstract void chemistry();
	// This is not possible because the class is regular and not abstract.
	// If the class is not abstract, the method is not defined/declared.

	public void biology() {
		System.out.println("This is the biology method");
	}

	public ColumbiaUniversity() {
	}

	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void laboratory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void languageClub() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lawInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void vocationalInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void classSize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playGround() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void teacher() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hygiene() {
		// TODO Auto-generated method stub
		
	}
}

/*
 * Two keywords are used for inheritance in Java for regular Class, "implements" and "extends". 
 * A regular class can inherit an abstract or regular class with the extends keyword and the implements 
 * keyword, if you use override method, and inherit Interfaces with the implements keyword. 
 * One "extends" inheritance and more than one "implements" inheritances for Interface are possible in a regular class.
 */
 