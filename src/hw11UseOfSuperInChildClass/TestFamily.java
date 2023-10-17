package hw11UseOfSuperInChildClass;

public class TestFamily {
	public static void main(String[] args) {
		Father father = new Father();
		Father father1 = new Father("Bob", 40, 'f', true, "Smith");

		father1.father();
		father1.father("Philip", 40, 'f', true, "Thompson");
		
		Daughter daughter = new Daughter();
		Daughter daughter1 = new Daughter("March",25);

		daughter1.daughter();
		daughter1.daughter("March",25);
		
	}
}
