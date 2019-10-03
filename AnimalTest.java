package polymorphism;
public class AnimalTest {
public static void main(String[] args) {
		Animal dog1 = new Dog("fghi");
		Animal pig1 = new Pig("pig");
		Animal [] myAnimals = {dog1,pig1};
		for (Animal o: myAnimals ) {
			System.out.println("I am a "+o.species);
			o.makeSounds();
		}
	}
}
