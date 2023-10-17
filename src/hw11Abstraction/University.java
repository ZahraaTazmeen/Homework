package hw11Abstraction;

public interface University extends College, Hospital{
	public void classSize();

	public void playGround();

	public void teacher();

	// public University() {
	// }
	// It is because constructors cannot be declared in Interfaces.
}

/*
 * One keyword is used for inheritance in Interface, "extends". 
 * An interface can inherit other interfaces with the extends keywords but can't inherit a regular or abstract class 
 * with any key word.
 * More than one inheritances are possible in Interface. 
 */