public class IfElse
{
   public static void main(String[] args)
   {
      String name = "";
      
      if (name.equalsIgnoreCase("Thabo"))
      {
         name = "Thabo";
         System.out.print("Hello, " + name);
      }
      else if (name.equalsIgnoreCase("Tony"))
      {
         name = "Tony";
         System.out.print("output a greeting to " + name + ".");
      }
      else
      {
          System.out.print("user is not recognised.");
      }
      
      
   }
}