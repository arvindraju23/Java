public class finallyException {
    public static void main(String[] args) {
       // System.out.println(10/0);
        /*  if here is exception then progam will crash
         and final message will be not printed 
         or program will not execute further.

         //if i want to compulsorliy execute final message 
        then i should use final block.*/

        //System.out.println("Final Message.");

        try{
            System.out.println(10/0);
        }
        // if i want to handle the exception then i have to write the Catch block.
        catch (ArithmeticException e){
            System.out.println(e);

        }
        finally{
            System.out.println("Final Message");
        }
    }

}
