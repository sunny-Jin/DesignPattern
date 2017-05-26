package Abstract;

/**
 * Created by jzy on 2017/5/25.
 */
public class ColorFactory extends AbstractFactory {
    public Color getColor(String color)
    {
        if(color.equalsIgnoreCase("Green"))
        {
            return new Green();
        }
        else if(color.equalsIgnoreCase("Red"))
        {
            return new Red();
        }
        else if(color.equalsIgnoreCase("Blue"))
        {
            return new Blue();
        }
        else
        {
            return  null;
        }
    }
    public Shape getShape(String shape)
    {
        return  null;
    }
}
