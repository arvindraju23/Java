 import java.util.*;
import java.lang.*;
public class Anagram{
public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter 1st String");
        String str1=sc.nextLine();
        System.out.println("Enter 2nd String");
        String str2=sc.nextLine();



     }

public void checkifAnagram(String str1, String str2){
    boolean anagram=true;
    for(char c: str1.toCharArray()){
        if(!str2.contains(String.valueOf(c))){
            System.out.println("String are anagram");
            anagram=false;
        }
        if(anagram==true){
            System.out.println("String is not Anagram");
        }
    }
}
}
