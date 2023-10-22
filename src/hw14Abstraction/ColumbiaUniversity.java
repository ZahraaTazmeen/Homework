package hw14Abstraction;

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {

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
	public void dorm() {
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
	public void morgue() {
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
	public void gymnasium() {
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

	@Override
	public void mechanicalLab() {
		// TODO Auto-generated method stub
		
	}

}

/*
 * One keyword is used for inheritance in Java for a regular Class. 
 * A regular class can inherit another regular class or a abstract class but not an Interface by extends keyword. 
 * A regular class can inherit only an abstract or a regular class once.
 */