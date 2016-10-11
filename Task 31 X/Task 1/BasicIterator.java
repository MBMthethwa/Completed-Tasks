import java.util.ArrayList;
import java.util.Iterator;

public class BasicIterator
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
     
      Iterator itorator = groupC.iterator();
      int count = 0;
      
      while(itorator.hasNext())
      {
         System.out.println(itorator.next());
         count++;
        
         //groupC.remove(count);
      }
      
       System.out.println(count);
        

   }
}