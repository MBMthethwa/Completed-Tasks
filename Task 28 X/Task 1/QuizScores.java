import java.util.ArrayList;



public class QuizScores
{

   public static void main(String[] args)
   {
      ArrayList<Integer> groupC = new ArrayList<Integer>();
      
      groupC.add(20);
      groupC.add(50);
      groupC.add(70);
      groupC.add(10);
      groupC.add(110);
      groupC.add(56);
      groupC.add(90);
      groupC.add(77);
      groupC.add(60);
      groupC.add(99);
      
      
     
      System.out.println("ArrayList :");
      for(int item : groupC)
      {
         System.out.println(item);
      }
      
      int highest = groupC.get(0);
      
      for(int i = 0 ; i < groupC.size(); i++)
      {
         if(groupC.get(i) > highest)
         {
            highest = groupC.get(i);
         }
          
         
      }
      
      System.out.println("highest :" + highest);
      
      int pos = 0;
      int lowest = groupC.get(0);
      
      for(int i = 0 ; i < groupC.size(); i++)
      {
         if(groupC.get(i) < lowest)
         {
            lowest = groupC.get(i);
             pos = i;
         }
          
         
      }
      
      System.out.println("lowest :" + lowest);
      
      System.out.println("remove lowest :" + lowest);
      groupC.remove(pos);
      
      lowest = groupC.get(0);
      
      
      for(int i = 0 ; (i < (groupC.size() - 1)); i++)
      {
         if(groupC.get(i) < lowest)
         {
            lowest = groupC.get(i);
            
         }
          
         
      }
      System.out.println("new lowest :" + lowest);
      

      
      
   }
}