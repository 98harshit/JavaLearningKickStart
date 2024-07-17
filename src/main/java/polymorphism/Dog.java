package polymorphism;

public class Dog extends Animal{

	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.makeNoise();

	}
	
	public void makeNoise()
	{
		System.out.println("Dog barks");
	}

}
