package superKeywordDemo;

public class Child extends Parent{
	
	public Child()
	{
		super(); //parent constructor will call
	}
	
	String empName = "Jeff";
	int empNo = 6651;
	
	public static void main(String[] args) {
		
		Child c = new Child();
		c.getData();
		
	}
	
	public void getData()
	{
		System.out.println(super.empName);
		System.out.println(super.empNo);
	}

}
