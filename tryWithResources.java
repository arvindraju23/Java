import java.util.Scanner;
import java.io.*;


public class tryWithResources {
    //static FileInputStream fi;
    //static Scanner sc;
    static void Divide() throws Exception
    {
        //fi= new FileInputStream("/Users/Arvind/Desktop/raju.txt");
        
        // Try With Resources.

        try (FileInputStream fi= new FileInputStream("/Users/Arvind/Desktop/raju.txt"); Scanner sc=new Scanner(fi)){ 
        //sc= new Scanner(fi);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        System.out.println(a/c);
        }
        // finally{
        // fi.close(); 
        // sc.close();
        // }
    }
    public static void main(String[] args) throws Exception
    {
       try{   
        Divide();
       }
       catch(Exception e)
       {
        System.out.println(e);
       }

       // int x =sc.nextInt();

        //System.out.println(x);

    }
    
}
