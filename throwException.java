
import java.lang.*;
import java.util.*;
// public class throwException {
    // static int meth1(){
    //     return 10/0;
    // }
    // static int meth2(){
    //    return meth1();
    // }
    // static int meth3(){
    //    return meth2();
    // }
    // public static void main(String[] args) {
    //     try{
    //     meth3();
    //     }
    //     catch(Exception e){
    //         System.out.println(e);
    //     }
    // }

    // Exception Handling using throw and throws 

    // static int area(int l, int b)throws Exception{
    //     if(l<0 || b<0){
    //         throw new Exception();
    //     }
    //     return l*b;
    // }
    // static void meth1() throws Exception{
    //     System.out.println("Area is: " +area(-10,4));
    // }
    // public static void main(String args []) throws Exception{
    //     try{
    //     meth1();
    //     }
    //     catch(Exception e){
    //         System.out.println(e);
    //     }
    // }
//}
    // Exception handling using user defined exception

    class NegativeDimensionException extends Exception
    {
        public String  toString(){
            return "Dimension of a Rectangle cannot be Negative ";
        }
    }
    public class throwException{
        static int area(int l, int b)throws NegativeDimensionException{
                if(l<0 || b<0){
                    throw new NegativeDimensionException();
                }
                return l*b;
            }
            static void meth1() throws NegativeDimensionException{
                System.out.println("Area is: " +area(-10,4));
            }
            public static void main(String args []) throws Exception{
                try{
                meth1();
                }
                catch(NegativeDimensionException e){
                    System.out.println(e);
                }
            }
    }
