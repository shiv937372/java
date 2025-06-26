//WAP  a java to check wether number is even or odd
import java .util.*;
class checkevenodd
{
   public static void main(String args[])
   {
   int no;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter any number:");
   no=sc.nextInt();
   if(no%2==0)
   {
   System.out.println("EVEN NUMBER!!!!");
   }
   else
   {
   System.out.println("odd NUMBER!!!!");
   }
   sc.close();
   }
}