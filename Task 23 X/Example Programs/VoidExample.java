public class VoidExample {

   public static void main(String[] args) {
      RankPoints(89.7);
   }

   public static void RankPoints(double points) {
      if (points >= 85.0) {
         System.out.println("Rank:A");
      }
      else if (points >= 70.0) {
         System.out.println("Rank:B");
      }
      else {
         System.out.println("Rank:C");
      }
   }
}