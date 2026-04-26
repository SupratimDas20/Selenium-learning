package oops;

class Dog{
	
	//Variables
	int eyes=2;
	String name="Pluto";
	float weight=12.4f;
	int tail=1;
	String fur="soft";
	
	//functions/methods/modules
	public void jump() {
		System.out.println("Dogs love to jump height");
	}
	public void fight() {
		System.out.println("Dogs fight");
	}
	public void bark() {
		System.out.println("Dogs bark loudly");
	}
	public void drinkMilk() {
		System.out.println("Dogs drink milk");
	}
	public void chaseCat() {
		System.out.println("Dogs chase the cat everytime");
	}
	
}

public class Encapsulation {

	public static void main(String[] args) {
		Dog obj = new Dog();
		System.out.println(obj);

		// Printing the class variables	
		System.out.println(obj.eyes);
		System.out.println(obj.name);
		System.out.println(obj.weight);
		System.out.println(obj.tail);
		System.out.println(obj.fur);
		
		// Calling the class methods
		obj.bark();
		obj.jump();
		obj.fight();
		obj.drinkMilk();
		obj.chaseCat();
		
	}

}
