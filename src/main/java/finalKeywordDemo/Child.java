package finalKeywordDemo;

public class Child extends Parent{
	
	public final int x=20;
	
	public static void main(String[] args) {
		
		Child c = new Child();
		System.out.println(c.x);
		//x=30;  we cannot update value of final variable
		c.setdata();
	}

}
