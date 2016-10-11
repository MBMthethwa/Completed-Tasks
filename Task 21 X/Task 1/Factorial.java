public class Factorial
{
   public static void main(String[] args)
   {
      
      int temp = 0;
      int factorials[] = new int[12];
     
     for(int x = 0; x < factorials.length ;x++ )
     {
      
       
         for(int y = x ;y > 1; y--)
         {
            if(temp == 0)
            {
              temp = y * (y - 1); 
			     			   
            }
            else
            {
				 
				   	temp = temp * (y -1);
				   
				                 
            }
         }
         if(x == 1 || x == 0)
         {
            temp = 1;
         }
         factorials[x] = temp;
         System.out.println(factorials[x]);
         
         temp = 0;
          
         
     }
     
    System.out.println("Answer must be the same from example " + factorials[4]);
    

            
   }
}