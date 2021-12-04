import java.util.*;
public class decimalToBinaryTest
{
   public static void main (String [] args)
   {

      int n;
      Scanner in = new Scanner(System.in);

      System.out.println("Enter a positive interger");
      n=in.nextInt();

      if(n < 0)
      {
         System.out.println("Not a positive interger");
      }

      else
      {
         System.out.print("Convert to binary is: ");
         binaryform(n);
      }   
   }


   private static Object binaryform(int number)
   {

      int remainder;

      if(number <= 1)
      {
         System.out.print(number);
         return " ";
      }   


      remainder= number % 2;
      binaryform(number >> 1);
      System.out.print(remainder);
      {
         return " ";
      }   
   }
}
