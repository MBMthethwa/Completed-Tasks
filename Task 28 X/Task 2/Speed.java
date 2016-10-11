
import java.util.LinkedList;

public class Speed
{
   public static void main(String[] args)
   {
      LinkedList<String> cars = new LinkedList<String>();
      
      cars.add("GTI");
      cars.add("BMW");
      cars.add("hama");
      cars.add("Toyota");
      cars.add("Isuszu");
      cars.add("Ford");
      cars.add("polo");
      cars.add("Man");
      cars.add("Mesdze");
      cars.add("golf");
      
      for(int y = 0; y < cars.size(); y++ )
      {
         System.out.println(cars.get(y));
      }
      
      
   }
}