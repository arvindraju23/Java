import java.util.Scanner;

public class triangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float base,height, area;
        System.out.print("Enter Base: ");
        base=sc.nextFloat();
        System.out.print("Enter the height: ");
        height=sc.nextFloat();

        area=(base+height)/2;
        System.out.print("Area of triangle is: "+area);
        System.out.println();

    }
    
}
