import java.util.*;
//import java.lang.*;
public class Sum_of_array {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int arr[]= {2,4,6,8,10};
        int sum=0;
        for(int x:arr){
            sum=sum+x;
        }
        System.out.println("Sum of element is: " +sum);
    }
}
