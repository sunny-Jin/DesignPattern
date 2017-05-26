package ProductorAndCustomer;

/**
 * Created by jzy on 2017/5/11.
 */
public class Productor implements Runnable {
    private Info info;
    public Productor(Info info)
    {
        this.info=info;
    }

    public void run()
    {
        for(int i=0;i<100;i++)
        {
            if(i%2==0)
            {
               /* this.info.setTitle("jzy");
                try {
                    Thread.sleep(100);
                }catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                this.info.setContent("好学生");*/
                this.info.set("jzy","好学生");
            }
            else
            {
               /* this.info.setTitle("可爱萌动物");
                try {
                    Thread.sleep(100);
                }catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                this.info.setContent("草泥马");*/
                this.info.set("可爱萌动物","草泥马");
            }
        }
    }
}
