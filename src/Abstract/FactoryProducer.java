package Abstract;

/**
 * Created by jzy on 2017/5/25.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){

        if(choice.equalsIgnoreCase("Shape"))
        {
            return new ShapeFactory();
        }
        else if(choice.equalsIgnoreCase("Color"))
        {
            return  new ColorFactory();
        }
        else
        {
            return null;
        }
    }
}
