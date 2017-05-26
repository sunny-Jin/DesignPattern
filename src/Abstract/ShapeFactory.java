package Abstract;

/**
 * Created by jzy on 2017/5/25.
 */
public class ShapeFactory extends AbstractFactory  {
    public Shape getShape(String shape)
    {
        if(shape.equalsIgnoreCase("Circle")){
            return new Circle();
        }
        else if(shape.equalsIgnoreCase("Recetangle"))
        {
            return new Recetangle();
        }
        else if(shape.equalsIgnoreCase("Square"))
        {
            return new Square();
        }
        else
        {
            return null;
        }


    }

    public Color getColor(String color)
    {
            return  null;
    }

}
