
public class _10PrototypePatternDemo {
	public static void main(String[] args) 
	{
	      ShapeCache.loadCache();

	      MyShape clonedShape = (MyShape) ShapeCache.getShape("1");
	      System.out.println("MyShape : " + clonedShape.getType());	
	      System.out.println("Demo : MyShape : " + clonedShape.hashCode());		

	      System.out.println("-----------");

	      MyShape clonedShape2 = (MyShape) ShapeCache.getShape("2");
	      System.out.println("MyShape : " + clonedShape2.getType());
	      System.out.println("Demo : MyShape : " + clonedShape2.hashCode());		

	      System.out.println("-----------");

	      MyShape clonedShape3 = (MyShape) ShapeCache.getShape("3");
	      System.out.println("MyShape : " + clonedShape3.getType());
	      System.out.println("Demo : MyShape : " + clonedShape3.hashCode());		

	   }

}
