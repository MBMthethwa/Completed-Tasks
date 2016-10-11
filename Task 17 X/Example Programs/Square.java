// Implementation of while loop to print squares under 200

public class Square {
   public static void main (String[] args) {
   
      int square = 0;
   
      while (square * square < 200) {
         System.out.println(square + " squared = " + square * square);
         square += 1;
      }
   }
}