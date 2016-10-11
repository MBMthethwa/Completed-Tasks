import javax.swing.*;

public class While
{
   public static void main(String[] args)
   {
      String name = JOptionPane.showInputDialog("Enter your name ");
      String correctName = "Mbali"; 
      
      int count = 0;
      
      while(true)
      {
                 
         if(name.equalsIgnoreCase(correctName))
         {
            
            break;
         }
         else
         {
            count++;
            name = JOptionPane.showInputDialog("Enter your name ");
         }
         
 
      }
      
            JOptionPane.showMessageDialog(null,"Your tried  " + count + " times to get the correct name ");

      
   }
}