package BuilderPattern;

/**
 * Created by jzy on 2017/5/25.
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "ChickenBurger";
    }

    @Override
    public float price() {
        return 50;
    }
}
