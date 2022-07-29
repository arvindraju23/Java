import java.lang.*;
//import java.util.Scanner;
public class access_element{
    public static void main(String [] args){
       // Scanner sc=new Scanner(System.in);
        int Array[]={2,4,6,8,10};
        // Accessing element Right to Left.
        System.out.println("Accessing element of array right to left");
        for(int i=0; i<Array.length; i++){
            System.out.println(Array[i]);
        }
        System.out.println();
        // Accessing element of array left to right.
        System.out.println("Accessing element of array left to right");
        for(int j=Array.length-1; j>=0; j--){
            System.out.println(Array[j]);
        }
        System.out.println();
        // using for-each loop
        
        System.out.println("using for-each loop");
        for(int x:Array){
            System.out.println(x);
        }
    }
}