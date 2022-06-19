import java.lang.*;
import java.util.*;
public class ReadKeyboard
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of x and y");
int x=sc.nextInt();
int y= sc.nextInt();
int z= x+y;
System.out.println(z);
}
}