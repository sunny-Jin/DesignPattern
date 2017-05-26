package PrototypePattern;

import Abstract.*;

/**
 * Created by jzy on 2017/5/26.
 */
public class Circle extends Shape {
    public Circle(){
        type="Circle";
    }

    public void  draw()
    {
        System.out.println("圆形");
    }
}
