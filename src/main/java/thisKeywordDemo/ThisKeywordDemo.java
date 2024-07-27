package thisKeywordDemo;

public class ThisKeywordDemo {
	
	int x=10;
	int y=20;
	String s="This";
	
	public ThisKeywordDemo()
	{
		System.out.println("Default Constructor");
	}
	
	public ThisKeywordDemo(int x, int y)
	{
		this.x=x;
		this.y=y;
		System.out.println(x+y);
		System.out.println("Parametrerized Constructor");
	}
	
	public static void main(String[] args) {
		
		ThisKeywordDemo tkd = new ThisKeywordDemo(9,5);
		tkd.getData();
		
	}
	
	public void getData()
	{
		System.out.println(x+y);
	}

}
