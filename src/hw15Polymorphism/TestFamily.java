package hw15Polymorphism;

public class TestFamily {
	public static void main(String[] args) {
		Sister sister = new Sister();
		sister.sister(3, 1, 1, "2", 7, 4);
		sister.sister(2, 5, 4, "10", 9);
		sister.sister(5, 3, 2, "7");
		Sister.sister(6, 8, 8);
		sister.sister(9, 3);

		Niece niece = new Niece();
		niece.sister(2, 4, 4, "1", 3, 7);
		niece.sister(3, 9, 6, "7", 5);
		niece.sister(8, 3, 2, "4");
		Niece.sister(7, 1, 4);
		niece.sister(5, 21);

	}
}
