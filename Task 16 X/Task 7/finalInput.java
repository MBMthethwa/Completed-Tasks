import javax.swing.*;

public class finalInput
{
   public static void main(String[] args)
   {
      String name = "Mbali";
      String input = JOptionPane.showInputDialog("What is your name?");
      
     

      
      if (name.equalsIgnoreCase(input))
      {
        
         System.out.print("Hello");
      }
      else if (input.equalsIgnoreCase("Ben"))
      {
       
         System.out.print("Hello Ben.");
      }
      else
      {
          System.out.print("Hello Stranger.");
      }
      
      
   }
}