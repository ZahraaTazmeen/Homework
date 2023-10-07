package hw8JavaConstructor;

public class StudentTest {
	public static void main(String[] args) {
		Student student = new Student();

		Student zahraa = new Student("Zahraa Tazmeen", 412431, 'F', true, 10f);
		Student mia = new Student("Mia Tagnina", 473218, 'F', false, 3f);
		Student lilly = new Student("Lilly Tagnina", 424575, 'F', false, 5f);
	}
}