import javax.swing.*;

public class For
{
   public static void main(String[] args)
   {
      int inputNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter the positive number or -1 to terminate "));
      
      int sum = 0,count = 0;
      
      for(; ;)// the loop will loop forever until -1 is entered.
      {
         if(inputNumber == -1)// if the entered input is -1, the loop will terminate
         {
            break;
         }
         else
         {
            sum = sum + inputNumber;
            count++;
            inputNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter the positive number or -1 to terminate "));
               
         }
    
      }
       int average = sum / count;
            JOptionPane.showMessageDialog(null,"The average is  " + average);

      

      
   }
}