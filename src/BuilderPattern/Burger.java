package BuilderPattern;

/**
 * Created by jzy on 2017/5/25.
 */
public abstract class Burger implements Item {
    @Override
    public abstract String name();

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
