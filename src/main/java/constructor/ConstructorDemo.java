package constructor;

public class ConstructorDemo {
	
	public ConstructorDemo()
	{
		System.out.println("No argument Constructor");
	}
	
	public ConstructorDemo(int i)
	{
		System.out.println("Parameterized Integer Constructor");
	}
	
	public ConstructorDemo(String s)
	{
		System.out.println("Parameterized String Constructor");
	}

	public static void main(String[] args) {


		ConstructorDemo cd = new ConstructorDemo();
		ConstructorDemo cd1 = new ConstructorDemo(1);
		ConstructorDemo cd2 = new ConstructorDemo("String");
		
	}

}
