package BuilderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jzy on 2017/5/26.
 */
public class Meal {
    private List<Item> itemList = new ArrayList<Item>();

    public void addItem(Item item)
    {
        itemList.add(item);
    }

    public float getCost()
    {
        float cost = 0.0f;
        for(Item item:itemList)
        {
            cost+=item.price();
        }
        return cost;
    }

    public void showItem()
    {
        for(Item item:itemList)
        {
            System.out.println("Item:"+item.name());
            System.out.println("Packing:"+item.packing());
            System.out.println("Price:"+item.price());
        }
    }
}
