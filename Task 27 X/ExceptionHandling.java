public class ExceptionHandling
{
   public void printOneByOne(String printOneByOne) throws Exception
   {
      for(int i = 0; i < 100; i++)
      {
         System.out.println(printOneByOne.charAt(i));
      }
   
   }
   public static void main(String[] args)
   {
      ExceptionHandling exceptionHandling = new ExceptionHandling();
      
      try
      {
         exceptionHandling.printOneByOne("EXEPTION");
      }
      catch(Exception e)
      {
         System.out.println("Caught the exception " + e);
      }
      
   
   }
}