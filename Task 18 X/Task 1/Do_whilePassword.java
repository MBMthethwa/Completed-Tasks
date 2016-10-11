import javax.swing.*;

public class Do_whilePassword
{
   public static void main(String[] args)
   {
      String correctPassword = "John";
      String newPassword = "";
      String password = "";
      int count = 0;
      boolean validPassword = false;
      char firstCharacter = 'a';

      do
      {
                 
         if(password.equalsIgnoreCase(correctPassword))
         {
            
            JOptionPane.showMessageDialog(null,"You successful logged in");

            break;
         }
         else if(count <= 3)
         {
             password = JOptionPane.showInputDialog("Enter the password ");
             count++;

         }
         
         if(count >= 3)
         {
             JOptionPane.showMessageDialog(null,"The password was John. Please set a new user password: ");
             
              do
              {
                  newPassword = JOptionPane.showInputDialog("Enter the new password  \n 1. The password may have any number of characters between 1 and 20, \n 2. The password may start with an underscore “_” or any letter of the alphabet \n 3. The password may be any combination of upper and lower case letters. \n 4. The password consists only of numbers, English alphabet letters, and the underscore character. ");
                 
                  validPassword = false;
                  firstCharacter = newPassword.charAt(0);
                  
                    if(newPassword.length() <= 20 )
                    {
                        if(Character.isLetter(firstCharacter) ||firstCharacter == '-' )
                        {
                           correctPassword = newPassword;
                           JOptionPane.showMessageDialog(null,"Password changed ");
                           validPassword = true;

                           break;
                        }
                        
                  
                    }
                    else
                    {
                        validPassword = false;
   
                    }

              }
              while(validPassword = true);

              
               if(validPassword)
               {
                  break;
               }             
            

             
         }
         
      }
      while(count <= 3 || validPassword == true);
      
      System.out.println(correctPassword);
   }
}