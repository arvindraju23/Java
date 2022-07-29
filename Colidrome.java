//import java.lang.*;
import java.util.*;

public class Colidrome{
        public static void main(String args []){
        //String str="Mallom"; 
        Scanner sc = new Scanner (System.in); 
        System.out.println("Enter the String");
        String str=sc.nextLine();

        String firstHalf=str.substring(0, str.length()/2);
        String SecondHalf=str.substring (str.length()/2);
        
            if(firstHalf.equals(new StringBuilder(SecondHalf).reverse().toString())){
                System.out.println("It is a Colidrome");
            }
            else{
                System.out.println("It is not a Colidrome");
            }
        
    }
}
/*
Colidrome means a String (Words) having equal number of alphabet in reverse order. 
 * Enter the String
 * String str="Mallom" --> It is not a Colidrome.
 * String str="Mallam" --> It is not a Colidrome.
 * 
 * String str="mallam" --> It is a Colidrome.
 */