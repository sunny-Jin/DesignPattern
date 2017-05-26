package Multiton;

/**
 * Created by jzy on 2017/5/7.
 */
public class Sex {
    private String title;
    private static final Sex MALE=new Sex("男");
    private static final Sex FEMALE=new Sex("女");

    private Sex(String title)
    {
        this.title=title;
    }

    public String toString()
    {
        return this.title;
    }

    public static Sex getInstance(int ch)
    {
        switch (ch)
        {
            case 1:return  MALE;
            case 2:return FEMALE;
            default:return null;
        }
    }
}
