package Singleton;

/**
 * Created by jzy on 2017/5/7.
 */
public class Singleton {
    private  static Singleton instance;
    private Singleton(){}
    public   static Singleton getInstance(){
      //  return instance;  //饿汉式
        if(instance==null)
        {
            instance=new Singleton();
        }
        return instance;

    }

    public void print()
    {
        System.out.println("Hello world");
    }
}
