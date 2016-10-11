
import javax.swing.*;

public class Switch
{
   public static void main(String[] args)
   {
      int inputNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter number between 0 and 100 "));
      String zero = "zero" ,one = "one",two = "two",three = "three",four = "four",five = "five" ,six = "six",seven = "seven",eight = "eight",nine ="nine";
       
       
      while(inputNumber > 0 && inputNumber < 100)
      {
         if(inputNumber < 10)
         {
            switch(inputNumber)
            {
         
        
           
               case 0: System.out.println(zero);
                  break;
               case 1: System.out.println(one);
                  break;
               case 2: System.out.println(two);
                  break;
               case 3: System.out.println(three);
               break;
               case 4: System.out.println(four);
                  break;
               case 5: System.out.println(five);
                  break;
               case 6: System.out.println(six);
                  break;
               case 7: System.out.println(seven);
               break;
               case 8: System.out.println(eight);
                  break;
               case 9: System.out.println(nine);
                  break;
               }
               break;
  
           }
           else if(inputNumber >= 10 && inputNumber <= 19)
           {  

               switch(inputNumber)
               {
           
                  case 10: System.out.println("ten");
                     break;
                  case 11: System.out.println("eleven");
                     break;
                  case 12: System.out.println("twelve");
                     break;
                  case 13: System.out.println("thirteen");
                  break;
                  case 14: System.out.println("fourteen");
                     break;
                  case 15: System.out.println("fifteen");
                     break;
                  case 16: System.out.println("sixteen");
                     break;
                  case 17: System.out.println("seventeen");
                  break;
                  case 18: System.out.println("eighteen");
                     break;
                  case 19: System.out.println("ninteen");
                     break;
                }
                 break;
   
            
         }
         else if(inputNumber >= 20 && inputNumber < 100)
         {
        
           switch(inputNumber)
           {
            
               case 20: System.out.println("twenty");
                  break;
               case 21: System.out.println("twenty " + one );
                  break;
               case 22: System.out.println("twenty " + two) ;
                  break;
               case 23: System.out.println("twenty " + three);
               break;
               case 24: System.out.println("twenty " + four);
                  break;
               case 25: System.out.println("twenty " + five);
                  break;
               case 26: System.out.println("twenty " + six);
                  break;
               case 27: System.out.println("twenty " + seven);
                   break;
               case 28: System.out.println("twenty " + eight);
                  break;
               case 29: System.out.println("twenty " + nine);
                  break;
                case 30: System.out.println("thirty");
                  break;
               case 31: System.out.println("thirty " + one );
                  break;
               case 32: System.out.println("thirty " + two );
                  break;
               case 33: System.out.println("thirty " + three);
                  break;
               case 34: System.out.println("thirty " + four);
                  break;
               case 35: System.out.println("thirty " + five);
                  break;
               case 36: System.out.println("thirty " + six);
                  break;
               case 37: System.out.println("thirty " + seven);
                   break;
               case 38: System.out.println("thirty " + eight);
                   break;
               case 39: System.out.println("thirty " + nine);
                   break;
               case 40: System.out.println("forty ");
                   break;
               case 41: System.out.println("forty " + one );
                  break;
               case 42: System.out.println("forty " + two) ;
                  break;
               case 43: System.out.println("forty " + three);
               break;
               case 44: System.out.println("forty " + four);
                  break;
               case 45: System.out.println("forty " + five);
                  break;
               case 46: System.out.println("forty " + six);
                  break;
               case 47: System.out.println("forty " + seven);
                   break;
               case 48: System.out.println("forty " + eight);
                  break;
               case 49: System.out.println("forty " + nine);
                  break;
                case 50: System.out.println("fifty");
                  break;
               
               case 51: System.out.println("fifty " + one );
                  break;
               case 52: System.out.println("fifty " + two );
                  break;
               case 53: System.out.println("fifty " + three);
                  break;
               case 54: System.out.println("fifty " + four);
                  break;
               case 55: System.out.println("fifty " + five);
                  break;
               case 56: System.out.println("fifty " + six);
                  break;
               case 57: System.out.println("fifty " + seven);
                   break;
               case 58: System.out.println("fifty " + eight);
                   break;
               case 59: System.out.println("fifty " + nine);
                   break;
               case 60: System.out.println("fifty ");
                   break;
               case 61: System.out.println("sixty " + one );
                  break;
               case 62: System.out.println("sixty " + two );
                  break;
               case 63: System.out.println("sixty " + three);
                  break;
               case 64: System.out.println("sixty " + four);
                  break;
               case 65: System.out.println("sixty " + five);
                  break;
               case 66: System.out.println("sixty " + six);
                  break;
               case 67: System.out.println("sixty " + seven);
                   break;
               case 68: System.out.println("sixty " + eight);
                   break;
               case 69: System.out.println("sixty " + nine);
                   break;
               case 70: System.out.println("seventy ");
                   break;
               case 71: System.out.println("seventy " + one );
                  break;
               case 72: System.out.println("seventy " + two );
                  break;
               case 73: System.out.println("seventy " + three);
                  break;
               case 74: System.out.println("seventy " + four);
                  break;
               case 75: System.out.println("seventy " + five);
                  break;
               case 76: System.out.println("seventy " + six);
                  break;
               case 77: System.out.println("seventy " + seven);
                   break;
               case 78: System.out.println("seventy " + eight);
                   break;
               case 79: System.out.println("seventy " + nine);
                   break;
               case 80: System.out.println("eighty ");
                   break;
               case 81: System.out.println("eighty " + one );
                  break;
               case 82: System.out.println("eighty " + two );
                  break;
               case 83: System.out.println("eighty " + three);
                  break;
               case 84: System.out.println("eighty " + four);
                  break;
               case 85: System.out.println("eighty " + five);
                  break;
               case 86: System.out.println("eighty " + six);
                  break;
               case 87: System.out.println("eighty " + seven);
                   break;
               case 88: System.out.println("eighty " + eight);
                   break;
               case 89: System.out.println("eighty " + nine);
                   break;
               case 90: System.out.println("ninety ");
                   break;
               case 91: System.out.println("ninety " + one );
                  break;
               case 92: System.out.println("ninety " + two );
                  break;
               case 93: System.out.println("ninety " + three);
                  break;
               case 94: System.out.println("ninety " + four);
                  break;
               case 95: System.out.println("ninety " + five);
                  break;
               case 96: System.out.println("ninety " + six);
                  break;
               case 97: System.out.println("ninety " + seven);
                   break;
               case 98: System.out.println("ninety " + eight);
                   break;
               case 99: System.out.println("ninety " + nine);
                   break;
              
                   
   
               
             } 
              break; 
                           
         }
         
         

      }     
    
  }
} 