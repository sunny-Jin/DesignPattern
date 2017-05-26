package Proxy;

/**
 * Created by jzy on 2017/5/6.
 */
public class ProxyDemo {
    public static  void main(String args[])
    {
        Subject sub =new ProxySubject(new RealSubject());
        sub.make();

    }
}
