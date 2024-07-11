


class Animal{
	String dog="peter";
	String cat;
	
	public String voice() {
		return "Dog is barking";
	}
	
	public String eat() {
		return "cat is eating";
	}
}

public class Object1 extends Animal{
	
	public String voice() {
		return "I am in Object class voice method";
	}
	
	String dog = "Taffi";

	public static void main(String[] args) {
		Animal animal = new Animal();
		System.out.println(animal.voice());
		
		Object1 object = new Object1();
		System.out.println(object.eat());
		System.out.println(object.voice());
		
		System.out.println(object.dog); 

	}

}
