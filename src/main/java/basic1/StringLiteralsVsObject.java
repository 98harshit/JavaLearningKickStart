package basic1;

public class StringLiteralsVsObject {

	public static void main(String[] args) {
		
		String str1 = "Java";
		String str3 = "Java";
		String str2 = new String("Java");
		//str2 = "Java";
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1==str3);

	}

}
