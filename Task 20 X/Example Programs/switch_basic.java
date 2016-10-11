public class switch_basic {
   public static void main (String[] args) {
      int n = 2, x = 0;
      switch (n) {
         case 1: x = 2;
            break;
         case 2: x = 4;
            break;
         case 3: x = 6;
            break;
         case 4: x = 8;
            break;
      }
      System.out.println(x);
   }
}