package Proxy;

/**
 * Created by jzy on 2017/5/6.
 */
public class ProxySubject implements Subject {

    private  Subject subject;

    public  ProxySubject(Subject subject)
    {
        this.subject=subject;
    }

    public  void Prepare()
    {
        System.out.println("在为真实主题做准备");
    }
    public void make()
    {
        this.Prepare();
        this.subject.make();
        this.destory();
    }

    public  void destory()
    {
        System.out.println("销毁器物");
    }
}
