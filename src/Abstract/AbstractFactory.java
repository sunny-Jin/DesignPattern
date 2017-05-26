package Abstract;

/**
 * Created by jzy on 2017/5/25.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
