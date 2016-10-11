public class switch_string {
   public static void main (String[] args) {
      String day = "Monday";
      switch(day) {
         case "Monday":
            System.out.println("Mondays are the worst!");
            break;
         case "Tuesday":
         case "Wednesday":
         case "Thursday":
            System.out.println("Weekdays are okay");
            break;
         case "Friday":
         case "Saturday":
         case "Sunday":
            System.out.println("Weekends are the best!");
            break;
         default:
            throw new IllegalArgumentException("Invalid day of the week: " + day);
      }
   }
}