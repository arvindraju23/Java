public class fibonacci { 
public static void main(String args[])  
{  
int i;  
int array[]= new int[11];  
array[0]= -1;  
array[1]=1;  
System.out.println("The Fibonacci series is: ");  
for(i=2; i<array.length; i++)  
{  
array[i]= array[i-2] + array[i-1];  
System.out.print(array[i]+ " " );  
}  
}  
}  
