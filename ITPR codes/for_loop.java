public class for_loop
{
    public static void main(String args[])
    {
    
        int i,j;
     for(i=0;i<6;i++)
     {
        System.out.println("*")
        for(j=i;j<5;j--)
        {
            System.out.println();
        }
        
     }
      for(i=0;i<6;i++)
     {
        for(j=0;j<i;j++)
        {
            System.out.print("*");
        }
     }
    }
}