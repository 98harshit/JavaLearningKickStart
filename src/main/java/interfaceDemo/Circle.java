package interfaceDemo;

public class Circle implements Shapes{

	public static void main(String[] args) {

		Circle c = new Circle();
		c.drawShape();
		c.colorShape();

	}

	@Override
	public void drawShape() {
		System.out.println("Drawing circle");
		
	}

	@Override
	public void colorShape() {
		System.out.println("Coloring circle");
		
	}

}
