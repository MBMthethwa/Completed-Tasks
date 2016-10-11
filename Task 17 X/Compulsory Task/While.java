import javax.swing.*;

public class While
{
   public static void main(String[] args)
   {
      int inputNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter the positive number or -1 to terminate "));
      
      int sum = 0,count = 0;
      
      while(inputNumber != -1)
      {
       
            sum = sum + inputNumber;
            count++;
            inputNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter the positive number or -1 to terminate "));
          
    
      }
      
      int average = sum / count;
      JOptionPane.showMessageDialog(null,"The average is  " + average);
      
      

      
   }
}