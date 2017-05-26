package BuilderPattern;

/**
 * Created by jzy on 2017/5/25.
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public float price() {
        return 30;
    }
}
