package Proxy;

/**
 * Created by jzy on 2017/5/6.
 */
public class RealSubject implements Subject {
    public void make()
    {
        System.out.println("真实主题在做事情");
    }
}
