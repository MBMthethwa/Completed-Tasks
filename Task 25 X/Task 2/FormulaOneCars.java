public class FormulaOneCars
{
   private static int numberOfWheels = 4;
   private static int topSpeed = 250;
   private double costPerWheel = 7000;
   private String wheelBrand = "Goodyear";
   
   public static void setNumberOfWheels(int numberOfWheels)
   {
      numberOfWheels = numberOfWheels; 
   }
   
   public static void setTopSpeed(int topSpeed)
   {
      topSpeed = topSpeed; 
   }
   
   public void setCostPerWheel(double costPerWheel)
   {
      this.costPerWheel = costPerWheel; 
   }
   
   public void setWheelBrand(String wheelBrand)
   {
      this.wheelBrand = wheelBrand; 
   }
   
   
   public static int getNumberOfWheels()
   {
      return numberOfWheels; 
   }
   
   public static int getTopSpeed()
   {
      return topSpeed;
   }
   
   public double getCostPerWheel()
   {
      return costPerWheel; 
   }
   
   public String getWheelBrand()
   {
      return wheelBrand; 
   }

   public static void main(String[] args)
   {
      FormulaOneCars formulaOneCars = new FormulaOneCars();
      
      
      
      System.out.println(FormulaOneCars.getNumberOfWheels());
      System.out.println(FormulaOneCars.getTopSpeed());
      
      System.out.println(formulaOneCars.getCostPerWheel());
      System.out.println(formulaOneCars.getWheelBrand());
      
      
   }
}