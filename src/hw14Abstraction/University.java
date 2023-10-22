package hw14Abstraction;

public interface University extends College, Hospital{
	public void classSize();

	public void playGround();

	public void teacher();

	// public University() {
	// }
	// It is because constructors cannot be declared in Interfaces.

	public void gymnasium();

	public static void library() {
	}
}

/*
 * One keyword is used for the inheritance in Interface.
 * An Interface can only inherit other Interfaces but not a regular or an abstract class by extends keyword.
 * An Interface can inherit more than one Interface.
 */