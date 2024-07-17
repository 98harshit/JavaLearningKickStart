package polymorphism;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading mo = new MethodOverloading();
		mo.login("ABC", "Pass");

	}
	
	public void login(int i, String p)
	{
		System.out.println("Login successful with Phone number and password");
	}
	
	public void login(String u, String s)
	{
		System.out.println("Login successful with Username and password");
	}

}
