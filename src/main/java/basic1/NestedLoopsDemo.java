package basic1;

public class NestedLoopsDemo {

	public static void main(String[] args) {
		
		int count=0;
		for(int i=1;i<=2;i++)
		{
			int j=1;
			while(j<=2)
			{
				for(int k=1;k<=2;k++)
				{
					System.out.println("Value of i="+i+", Value of j="+j+", Value of k="+k);
					count++;
				}
				j++;
			}
		}
		System.out.println(count);

	}

}
