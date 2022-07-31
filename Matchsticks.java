// public class Matchsticks {
    
// }

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Matchsticks
{
    static int match=0;
    static void matchstick(int num){
        switch(num){
            case 0: 
                match=match+6;
                break;
            case 1:
                match=match+2;
                break;
            case 2:
                match=match+5;
                break;
            case 3:
                match=match+5;
                break;
            case 4:
                match=match+4;
                break;
            case 5:
                match=match+5;
                break;
                
            case 6:
                match=match+6;
                break;
                
            case 7:
                match=match+3;
                break;
            case 8:
                match=match+7;
                break;
            case 9:
                match=match+6;
                break;
                        
            
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		//int test=sc.nextInt();
		// while(test-->0){
            System.out.println("Enter num1");
		    int a=sc.nextInt();
            System.out.println("Enter num2");
		    int b=sc.nextInt();
		    int sum=a+b;
            System.out.println("Summation of the number is: " +sum);
		    match=0;
		    int rem;
		    while(sum!=0){
		        rem=sum%10;
		        matchstick(rem);
		        sum=sum/10;
		        
		    }
            
		    System.out.println("Total Matchstics is used in formation of number is: " +match);
		//}
	}
}
