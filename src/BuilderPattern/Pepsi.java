package BuilderPattern;

/**
 * Created by jzy on 2017/5/25.
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 15;
    }
}
