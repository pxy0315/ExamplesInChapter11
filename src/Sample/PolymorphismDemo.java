package Sample;

public class PolymorphismDemo {

	public static void main(String[] args) {
		//display circcle and rectangle properties
		displayObject(new Circle(1,"red",false));
		displayObject(new Rectangle(1,1,"black",true));
	}
	/**dispay geometric object properties*/
	public static void displayObject(GeometricObject object) {
		System.out.println("Created on "+object.getDateCreated()+". color is "+object.getColor());
	}

}
