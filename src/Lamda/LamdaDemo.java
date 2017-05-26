package Lamda;

/**
 * Created by jzy on 2017/5/7.
 */
interface IMessage{
   // public void print();  //无参
  //  public void print(String str); //有参
      public int add(int a,int b);
}
public class LamdaDemo {
    public static void main(String args[])
    {
      //  fun(()->System.out.println("Hello Lamda 表达式"));
     //   fun((s)->System.out.println(s));
     //   fun((a,b)->System.out.println(a+b));
        fun((a,b)->a+b);
    }

    public static void fun(IMessage msg)
    {
      //  msg.print();
   //     msg.print("Hello World!!!");
      //  msg.add(10,20);
        System.out.println(msg.add(10,20));
    }
}
