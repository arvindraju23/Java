// Find Area of triangle.

import java.util.*;
import java.lang.*;

class triangle
{
public static void main(String args [] )
{
Scanner sc= new Scanner (System.in);
float base, height, area;
System.out.println("Enter base");
b=sc.nextFloat();
System.out.println("Enter height");
h=sc.nextFloat();
area= (b*h)/2;
System.out.println("Area of Triangle " +area);
}
}