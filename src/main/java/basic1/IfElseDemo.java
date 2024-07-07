package basic1;

public class IfElseDemo {

	public static void main(String[] args) {


		int num1 = 10;
		int num2 = 20;
		
		if(num1>num2)
		{
			System.out.println("Num1 is greater than Num2");
		}
		else if(num1==num2)
		{
			System.out.println("Num1 is equal to Num2");
		}
		else if(num1<num2)
		{
			System.out.println("Num1 is less than Num2");
		}
		else
		{
			System.out.println("Finally in else block");
		}

	}

}
