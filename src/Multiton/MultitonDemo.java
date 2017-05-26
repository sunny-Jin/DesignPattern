package Multiton;

/**
 * Created by jzy on 2017/5/7.
 */


public class MultitonDemo {
    public static void main(String args[])
    {
        Sex sex =Sex.getInstance(Choose.MALE);
        System.out.println(sex);
    }
}
