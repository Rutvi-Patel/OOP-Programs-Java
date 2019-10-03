package polymorphism;

public class Animal {
	String species;
	public Animal (String  species) {
		this.species = species;
	}
	public void makeSounds() {
		System.out.println("Animal make sounds!");
	}
}
class Dog extends Animal {
	public Dog(String species) {
		super(species);
	}
	public void makeSounds() {
		System.out.println("Woof! Woof!");
	}
}

class Pig extends Animal {
	public Pig(String species) {
		super(species);
	}
	public void makeSounds() {
		System.out.println("Wee! Wee!");
	}
}

