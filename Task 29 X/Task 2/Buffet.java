import java.util.HashSet;
import javax.swing.JOptionPane;

public class Buffet
{
   public static void main(String[] args)
   {
      HashSet<String> foodChoices = new HashSet<String>();
      String choice = JOptionPane.showInputDialog("Enter what do yo want to eat at a buffet, food name or nothing? ");
      
      do
      {
         if(choice.equals("nothing") == false)
         {
            foodChoices.add(choice);
            System.out.println("You added :" + choice );
 
            choice = JOptionPane.showInputDialog("Enter what do yo want to eat at a buffet, food name or nothing? ");
         }   
         System.out.println( foodChoices);

      }
      while(choice.equals("nothing") == false);
      
      System.out.println("The size of foodChoices is : " + foodChoices.size());
      System.out.println( foodChoices);
      
   }
}