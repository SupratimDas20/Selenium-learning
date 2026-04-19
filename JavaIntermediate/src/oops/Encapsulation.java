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
		obj.bark();
		
	}

}
