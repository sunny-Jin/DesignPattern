package PrototypePattern;

/**
 * Created by jzy on 2017/5/26.
 */
public class Square extends Shape {
    public void draw()
    {
        System.out.println("正方形");
    }

    public Square()
    {
        type="Square";
    }
}
