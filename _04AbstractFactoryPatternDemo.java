import java.util.Scanner;

public class _04AbstractFactoryPatternDemo {
	public static void main(String[] args) {

		System.out.println("Begin main..");
		
		System.out.println("Enter hint : ");
		Scanner scan = new Scanner(System.in);
		String hint  = scan.nextLine();
		
		
		AbstractFactory absFactory = FactoryProducer.getFactory(hint);
		
		//typeid -> c++
		
		if(absFactory instanceof ShapeFactoryImpl)
		{
			System.out.println("Pointing to ShapeFactoryImpl");
			Shape sha =	absFactory.getShape("circ");
			sha.draw();
			sha =	absFactory.getShape("rect");
			sha.draw();
			sha =	absFactory.getShape("sqa");
			sha.draw();
		}
		else if(absFactory instanceof ColorFactoryImpl)
		{
			System.out.println("Pointing to ColorFactoryImpl");
			Color col = absFactory.getColor("red");
			col.fill();
			col = absFactory.getColor("green");
			col.fill();
			col = absFactory.getColor("blue");
			col.fill();
		}
		
		
		System.out.println("End main..");

	}
}
