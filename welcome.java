//Print a welcome message.

import java.lang.*;
import java.util.*;

class welcome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String name;
System.out.println("May i know your name plz..");
name=sc.nextLine();
System.out.println("Welcome Mr/Mrs " +name);
}
}
