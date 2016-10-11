
import java.util.*;
public class BasicListIterator
{
 
  public static void main(String[] args)
  {
    int count = 0;
    int Sum = 0;
    double avg = 0.0;
  
  
    ArrayList<Integer> groupC = new ArrayList<Integer>(3);
    groupC.add(15);
    groupC.add(4);
    groupC.add(20);
   
    
    ListIterator itr = groupC.listIterator();
    
      while(itr.hasNext()) {
         Object element = itr.next();
         itr.set(element );
         count++;
      }
      System.out.println("Next forward : ");
      itr = groupC.listIterator();
      
      while(itr.hasNext())
      {
        System.out.println(itr.next());
      }
       System.out.println("Back : ");
      while(itr.hasPrevious()) {
         Object element = itr.previous();
         System.out.println(element );
       }
       System.out.println();
     
}
}