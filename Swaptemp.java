import java.util.*;
import java.io.*;
import java.lang.*;
public class Swaptemp
{
public static void main(String[] args) throws IOException
{
  int a=10,b=20;
 System.out.println("Before swapping");
System.out.println("value of a is:"+a);
System.out.println("value of b is:"+b);
swap(a,b);
}
private static void swap(int a,int b){
  
  int temp = a;
   a = b;
   b = temp;
 System.out.println("After swapping");
 System.out.println("value of a is:"+a);
System.out.println("value of b is:"+b);
} 
}










