package hw12Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Zahraa Tazmeen");
		employee.setAge(15);
		employee.setGender('f');
		employee.setCitizen(true);

		System.out.println("Name: " + employee.getName() + "\nAge: " + employee.getAge() + "\nGender: "
				+ employee.getGender() + "\nIs citizen?: " + employee.isCitizen());
	}
}