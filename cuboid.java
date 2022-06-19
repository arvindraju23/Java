//Find volume of Cuboid.
import java.lang.*;
import java.util.*;

public class Cuboid
{
public static void main( String args[])
{
Scanner sc=new Scanner (System.in);
int l,b,h, vol, totalArea;
System.out.println("Enter the length, breadth and height");
l=sc.nextInt();
b=sc.nextInt();
h=sc.nextInt();

vol=l*b*h;
totalArea=(2*((l*b)+(b*h) + (h*l)));

System.out.println("The volume of cuboid is " +vol);
System.out.println("TotalArea of Cuboid is "+totalArea);
}

}