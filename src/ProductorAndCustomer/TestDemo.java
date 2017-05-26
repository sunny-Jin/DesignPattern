package ProductorAndCustomer;

/**
 * Created by jzy on 2017/5/11.
 */
public class TestDemo {
    public static  void main(String args[])
    {
        Info info =new Info();
        new Thread(new Productor(info)).start();
        new Thread(new Customer(info)).start();
    }
}
