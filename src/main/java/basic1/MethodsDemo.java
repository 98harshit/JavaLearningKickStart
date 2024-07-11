package basic1;

public class MethodsDemo {

	public static void main(String[] args) {


		MethodsDemo md = new MethodsDemo();
		md.doLogin();
		md.doLogOut();
		md.diffParameter("This is String", 10, 25);

	}
	
	public void doLogin()
	{
		//login code
		
		System.out.println("Login successful");
	}
	
	public void doLogOut()
	{
		//logout code
		
		System.out.println("LogOut successful");
	}
	
	public void diffParameter(String s, int i, float j)
	{
		System.out.println(s);
		System.out.println(i);
		System.out.println(j);
	}

}
