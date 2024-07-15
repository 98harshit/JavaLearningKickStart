package encapsulation;

public class CreateBox {

	public static void main(String[] args) {


		Common cm = new Common();
		int l = cm.setLength(-10);
		int b = cm.setWidth(20);
		int h = cm.setHeight(-30);
		
		cm.setDimension(l, b, h);

	}

}
