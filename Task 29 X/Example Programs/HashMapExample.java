import java.util.HashMap;

public class HashMapExample {
   public static void main(String[] args) {
   
      // Create a HashMap of fruit and their color.
      HashMap<String, String> fruit = new HashMap<>();
      fruit.put("apple", "red");
      fruit.put("orange", "orange");
      fruit.put("banana", "yellow");
      fruit.put("raspberry", "red");
      
      // See if there is a red value.
      if (fruit.containsValue("red")) {
         System.out.println("Red fruit detected!");
      
         // Loop over all keys and print them if they have "red" values.
         for (String key : fruit.keySet()) {
            if (fruit.get(key) == "red") {
               System.out.println(key);
            }
         }
      }
   }
}