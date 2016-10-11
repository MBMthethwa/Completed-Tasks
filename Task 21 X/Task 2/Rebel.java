public class Rebel
{
   public static void main(String[] args)
   {
      int[] numbers = new int[6];
      String[] words = new String[11];
      
      System.out.println("numbers");
      for(int i = 1; i < numbers.length;i++)
      {
         numbers[i] = i;
         System.out.println(numbers[i]);
      }
      
      System.out.println("words");
      for(int x = 5; x < words.length;x++)
      {
         
         words[x] = String.valueOf(x) ;
         System.out.println(words[x]);
      }
      
       System.out.println("swapped number to words and multply buy 3");
      for(int i = 1; i < numbers.length;i++)
      {
         words[i] = String.valueOf(numbers[i] * 3);
         if(((Integer.parseInt(words[i]) %  2 ) == 0))
         {
            System.out.println(" take even to numbers");
            numbers[i] = Integer.parseInt(words[i]);
            System.out.println(numbers[i]);
         }
         System.out.println(words[i]);
      }
      
      System.out.println(" swapped words to numbers and multply buy 4");
       for(int x = 1; x < numbers.length;x++)
      {
         numbers[x] = Integer.parseInt(words[x] )* 4 ;
        
         if(numbers[x] % 2 == 0)
         {
            System.out.println(" take even to words");
            words[x] = String.valueOf(numbers[x]);
             System.out.println(words[x]);
         }

         System.out.println(numbers[x]);
      }
      
      
      System.out.println("number that are between 1 and 40 ");
       for(int x = 1; x < numbers.length;x++)
      {
         if(numbers[x] > 0 && numbers[x] < 40)
         {
            System.out.println(numbers[x]);
         }
      }
      
       System.out.println("all numbers in the array");
       for(int x = 1; x < numbers.length;x++)
      {
         
            System.out.println(numbers[x]);
         
      }
      
       System.out.println("all words in the array");
       for(int x = 1; x < words.length;x++)
      {
         
            System.out.println(words[x]);
         
      }

      
   }

}