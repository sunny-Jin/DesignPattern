package BuilderPattern;

/**
 * Created by jzy on 2017/5/26.
 */
public class BuilderPattern {
    public static void main(String args[])
    {
        MealBuilder mealBuilder = new MealBuilder();
        mealBuilder.prepareVegMeal().showItem();
        System.out.println("总价格为："+mealBuilder.prepareVegMeal().getCost());

        mealBuilder.prepareChiMeal().showItem();
       System.out.println("总价格为"+mealBuilder.prepareChiMeal().getCost());
    }
}
