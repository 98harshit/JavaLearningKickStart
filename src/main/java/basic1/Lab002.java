package basic1;

import java.util.Scanner;

public class Lab002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Num1");
		int num1 = scanner.nextInt();
		System.out.println(num1);
		System.out.println("Enter the Num2");
		int num2 = scanner.nextInt();
		System.out.println(num2);
		
		System.out.println("Sum is "+(num1+num2));
		System.out.println("Sub is "+(num1-num2));
		System.out.println("Mul is "+(num1*num2));
		
		

	}

}
