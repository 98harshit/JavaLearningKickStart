package basic1;

public class BreakAndContinueDemo {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++)
		{
			if(i==7)
			{
				break;
			}
			System.out.println(i);
		}
		System.out.println("Final statement after break");
		
		for(int i=1;i<=10;i++)
		{
			if(i==7)
			{
				continue;
			}
			System.out.println(i);
		}
		System.out.println("Final statement");

	}

}
