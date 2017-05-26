package BuilderPattern;

/**
 * Created by jzy on 2017/5/26.
 */
public class MealBuilder {

    public Meal prepareVegMeal()
    {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareChiMeal()
    {
        Meal meal =new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return  meal;
    }
}
