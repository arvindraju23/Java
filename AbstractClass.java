import java.lang.*;
import java.util.*;

abstract class shape
{
    //  public shape()
    // {
    //     System.out.println("Shape Constructor");
    // }
    abstract public double perimeter();
    abstract public double area();
}
 class circle extends shape
{
    int radius;

    @Override
    public double perimeter()
    {
        
        return (2*3.141*radius);
    }

    @Override
    public double area()
    {
       
        return (2*3.141*radius*radius); 
    }


}
 class rectangle extends shape
{
    int length, breadth;
    @Override
    public double perimeter()
    {
        
        return (2*(length+breadth));
    }
    @Override
    public double area()
    {
       
       return (length*breadth);
    }
}
public class AbstractClass
{
    /**
     * @param args
     */
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius, length, breadth");
        int radius=sc.nextInt();
        int length=sc.nextInt();
        int breadth=sc.nextInt();
        circle s=new circle();
        rectangle sh=new rectangle() ;
      

        System.out.println("Perimeter of circle is: "+ s.perimeter());
         System.out.println("Area of circle is: "+s.area());
         System.out.println("Perimeter of rectangle is: "+ sh.perimeter());
         System.out.println("Area of rectangle is: "+sh.area());
       
    }
}