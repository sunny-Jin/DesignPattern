package Factory;

/**
 * Created by jzy on 2017/5/6.
 */
public class FactoryDemo {

    public  static  void main(String args[])
    {

//        Fruit f = new Apple();
//        f.eat();
      //  Factory.getInstance("Apple").eat();

        Factory.getInstance("Factory.Apple").eat();
    }
}
