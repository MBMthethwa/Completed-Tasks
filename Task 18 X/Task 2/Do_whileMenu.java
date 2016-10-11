import javax.swing.*;


public class Do_whileMenu
{
   public static void main(String[] args)
   {
      int program = 0;
     
            
      do 
      {
         program = Integer.parseInt(JOptionPane.showInputDialog("The menu of the program is as follows: " + "\n " +
                                                               "1. task3.java  \n" +
                                                               "2. errors.java  \n " + 
                                                               "3. while.java  \n" +
                                                               "4. do_whilePassword.java  \n " +
                                                               "5. quit"));
         if(program == 1)
         {
            String nameOne = "Mbali";
            String nameTwo = "Tshepiso";
      
            if (nameOne.equalsIgnoreCase(nameTwo))
            {
               System.out.print("Names are the same");
            }
            else
            {
                System.out.print("Names are not the same.");
            }

         }
         else if(program == 2)
         {
            //System.out.println("Welcome to my first program!")
            System.out.println("Welcome to my first program!");
            
      		System.out.println("\n");
      		
      		//String ageStr  ="24 years"; //I'm 24 years old.     
            //int age  = 24 ; //I'm 24 years old.
             //syntax error
      
            
            int age = 24; 
            
      		
      		System.out.println("I'm " + age + " years old.");
      		
      		//int three = "3";
            int three = 3;
      	
      		
      		int answerYears = age + three;  //I want an int, so I'm adding two ints. 
      		
      		System.out.println("Toal number of years: " + answerYears);
      		
      		//int answerMonths = answerYears*12; logic error
            int answerMonths = answerYears * 12 + 6;
      		
      		System.out.println("In 3 years and 6 months, I'll be " + answerMonths + " months old");
      		
      		//HINT, 330 months is the correct answer
      	

         }
         else if(program == 3)
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
         else if(program == 4)
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
         while(program != 5 );
   }
}