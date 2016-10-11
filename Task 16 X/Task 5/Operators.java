public class Operators
{
   public static void main(String[] args)
   {
   	
      double numd = 120;
   		 
   		if ((numd/2)==50) //You can have an operation inside the condition
   		{
   			System.out.println("Numd must store the value 120, since 60 times 2 is equal to 120");
   			
   		}
   		else if (numd > 100)	//Greater than operator. This condition is true and, It is a first true condition to be executed. It can only execute one true condition and terminate.
   		{
   			//You can have nothing happen inside an if statement, but this is bad programming style.
            System.out.println( numd + " is greater than 100");

            
   		}
   		else if (numd < 100) //Less than operator. If you change the value of numd to 30. This condition will be true and, It is a first true condition to be executed. It can only execute one true condition and terminate.
   		{
   		    System.out.println( numd + " is less than 100");

   		}
   		else if (numd != 25) //NOT EQUAL TO OPERATOR
   		{
   			 System.out.println( numd + " is not equal to 100");
   		}
   		else if ( (numd%2)== 0) //MODULO OPERATOR. 
 
   		{
   			System.out.println("The value stored in numd is even because the remainder when it is divided by 2 is 0.");
   		}
         
                 
     }
 }