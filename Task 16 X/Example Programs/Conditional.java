public class Conditional {   
   public static void main (String[] args) {
      int a = 5;
      if (a > 0) {
          System.out.println("a is positive");
       } 
       else if (a >= 0) {
           System.out.println("a is positive or zero");
       } 
       else {
           System.out.println("a is negative");
      }
   }
}