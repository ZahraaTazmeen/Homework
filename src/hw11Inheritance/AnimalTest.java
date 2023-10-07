package hw11Inheritance;

public class AnimalTest {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.animalInfo();

		Birds birds = new Birds();
		birds.birdsInfo(); // This is the child class
		birds.animalInfo(); // This is the parent class
		// This is a single inheritance

		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		bullDog.dogInfo();
		bullDog.mammalInfo();
		bullDog.animalInfo();
		// This is a multi-level inheritance

		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();
		// This is a multi-level inheritance

		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo();
		dog.animalInfo();
		// This is a multi-level inheritance

		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		mammal.animalInfo();
		// This is a single inheritance

		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo();
		// This is a single inheritance

		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalInfo();
		// This is a multi-level inheritance

		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();
		// This is a multi-level inheritance

		// hierarchical inheritance is shown between the children classes Mammal,
		// Reptile, and Birds class and the parent class Animal class.
	}
}
