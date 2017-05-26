package BuilderPattern;

/**
 * Created by jzy on 2017/5/25.
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 10;
    }
}
