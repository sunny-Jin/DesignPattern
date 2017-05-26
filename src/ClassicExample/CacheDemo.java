package ClassicExample;

/**
 * Created by jzy on 2017/5/11.
 */
public class CacheDemo {
    public  static  void main(String args[])
    {
        int j=0;
        for(int i=0;i<100;i++)
        {
            j=j++;
            System.out.println(j);
        }
        System.out.println(j);  //j=0  Java缓存机制
    }
}
