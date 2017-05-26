package PrototypePattern;

import sun.security.provider.SHA;

import java.util.HashSet;
import java.util.Hashtable;

/**
 * Created by jzy on 2017/5/26.
 */
public class ShapeCache {
    private static Hashtable<String,Shape> shapeHashtable =new Hashtable<String,Shape>();

    public static Shape getShape(String shapeId)
    {
        Shape cacheShape = shapeHashtable.get(shapeId);
        return (Shape) cacheShape.clone();
    }

    public static void loadCache()
    {
        Circle circle =new Circle();
        circle.setId("2");
        shapeHashtable.put(circle.getId(),circle);


        Rectangle rectangle = new Rectangle();
        rectangle.setId("1");
        shapeHashtable.put(rectangle.getId(),rectangle);

        Square square = new Square();
        square.setId("3");
        shapeHashtable.put(square.getId(),square);
    }

}
