package superKeywordDemo;

public class Parent {
	
	public Parent()
	{
		System.out.println("Default Parent constructor");
	}
	
	public Parent(int i)
	{
		System.out.println("Parameterized constructor");
	}
	
	String empName = "Tom";
	int empNo = 12345;
	
	public void getData()
	{
		System.out.println(empName);
		System.out.println(empNo);
	}

}
