public class double_for {
   public static void main (String[] args) {
      int i, j;
      int[][] nums = {
         {1, 2, 5},
         {6, 9, 7},
         {8, 3, 4}
      };

      Outer:
         for (i = 0; i < nums.length; i++) {
            for (j = 0; j < nums[i].length; j++) {
               if (nums[i][j] == 7) {
                  System.out.println("Found number 9 at (" + i + ", " + j + ")");
                  break Outer;
               }
            }
         }
   }
}