package Abstract;

/**
 * Created by jzy on 2017/5/25.
 */
public class AbstractFactoryDemo {
    public static void main(String args[])
    {
        AbstractFactory shapeFactory1 = FactoryProducer.getFactory("Shape");
        shapeFactory1.getShape("Circle").draw();
        shapeFactory1.getShape("Square").draw();

        AbstractFactory colorFactory=FactoryProducer.getFactory("Color");
        colorFactory.getColor("Red").fill();
        colorFactory.getColor("Blue").fill();


    }
}
