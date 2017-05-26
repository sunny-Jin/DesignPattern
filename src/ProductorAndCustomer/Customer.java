package ProductorAndCustomer;

/**
 * Created by jzy on 2017/5/11.
 */
public class Customer implements Runnable {
    private Info info;

    public Customer(Info info)
    {
        this.info=info;
    }

    public void run()
    {
        for(int i=0;i<100;i++)
        {
           /* try{
                Thread.sleep(100);
            }catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println(this.info.getTitle()+"-----"+this.info.getContent());*/
            this.info.get();
        }
    }
}
