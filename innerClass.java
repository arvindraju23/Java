import java.lang.*;
import java.util.*;

class outer{
    static int x=20;
    inner i= new inner();

class inner{
    int y=25;
    public void innerDisplay(){
        System.out.println(x+" " +y);
    }

}
public void outerDisplay(){
    i.innerDisplay();
    System.out.println(i.y);
    }
}


public class innerClass{
    public static void main(String[] args) {
        outer.inner oi=new outer().new inner();
        oi.innerDisplay();
    }

}