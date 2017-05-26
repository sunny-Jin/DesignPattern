package ProductorAndCustomer;

/**
 * Created by jzy on 2017/5/11.
 */
public class Info {
    private String title;
    private String content;

    public void set(String title,String content)
    {
        this.title=title;
        try
        {
            Thread.sleep(100);
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        this.content=content;
    }

    public void get()
    {
        try {
            Thread.sleep(100);
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println(this.title+"-----"+this.content);
    }

    public void setTitle(String title)
    {
        this.title=title;
    }

    public void setContent(String content)
    {
        this.content=content;
    }

    public String getTitle()
    {
        return this.title;
    }

    public String getContent()
    {
        return this.content;
    }
}
