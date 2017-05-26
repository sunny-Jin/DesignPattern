package Factory;

/**
 * Created by jzy on 2017/5/6.
 */
public class Factory {
    public static  Fruit getInstance(String className)
    {
       /* if("Apple".equals(className))
        {
            return new Apple();
        }
        else if("Orange".equals(className))
        {
            return  new Orange();
        }
        else if("Banana".equals(className))
        {
            return  new Banana();
        }
        else
        {
            return  null;
        }*/

        //利用反射
        Fruit f=null;
        try {
            f=(Fruit)Class.forName(className).newInstance();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return f;

    }
}
