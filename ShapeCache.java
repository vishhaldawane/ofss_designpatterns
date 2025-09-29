import java.util.Hashtable;

public class ShapeCache {
	
   private static Hashtable<String, MyShape> shapeMap  = new Hashtable<String, MyShape>();

   public static MyShape getShape(String shapeId) 
   {
	  
      MyShape cachedShape = shapeMap.get(shapeId);
      return (MyShape) cachedShape.clone(); //shallow cloning vs deep closing
   }

   // for each shape run database query and create shape
   // shapeMap.put(shapeKey, shape);
   // for example, we are adding three shapes
   
   public static void loadCache() {
	  System.out.println("Loading Cache...");
      MyCircle circle = new MyCircle();// you can fetch it from the DB - select query
      System.out.println("ShapeCache:circle   : "+circle.hashCode());
      circle.setId("1");
     shapeMap.put(circle.getId(),circle);

      MySquare square = new MySquare();
      System.out.println("ShapeCache:square   : "+square.hashCode());

      square.setId("2");
     shapeMap.put(square.getId(),square);

      MyRectangle rectangle = new MyRectangle();
      System.out.println("ShapeCache:rectangle : "+rectangle.hashCode());

      rectangle.setId("3");
     shapeMap.put(rectangle.getId(), rectangle);
   }
}





