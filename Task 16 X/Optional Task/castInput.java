import javax.swing.*;

public class castInput
{
   public static void main(String[] args)
   {
      int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age?"));
    
      
      System.out.println(age / 2);
   }
}