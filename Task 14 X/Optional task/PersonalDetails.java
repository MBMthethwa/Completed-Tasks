public class PersonalDetails
{
   public static void main(String[] args)
   {
      String firstName = "Mbali";
      String fullName = firstName + " " + "Mthethwa";
      int age = 24 + 5;
      double height = 1.59;
      int favourateWholeNumber = 10 / 3;
      
      System.out.println("First Name: \t \t" + firstName);
      System.out.println("Age: \t  \t \t "  + age);
      System.out.println("Height: \t \t " + height);
      
      /*The expected answer is 3.333...
        Because my I declared my variable favourateWholeNumber to hold integer but my output is double, that why it forced(Rounded it to int) it to be interger.
      */
      System.out.println("Favourate Whole Number:\t" + favourateWholeNumber);
      
      
      
   }
}