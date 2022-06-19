// Find root of Quadratic Equation.

import java.util.*;
import java.lang.*;
import java.math.*;

class Quadratic
{
public static void main (String args[] )
{
Scanner sc=new Scanner(System.in);
/* roots= (-b +-(b*b - 4ac))/2a  */
int a,b,c;
double r1,r2;
System.out.println("Enter a,b,c");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();

r1=(-b +Math.sqrt(b*b -4*a*c))/(2*a);
r2=(-b -Math.sqrt(b*b -4*a*c))/(2*a);
System.out.println("Roots are " +r1 +" " +r2);

}
}