
public class Animal 
{
	private int numTeeth = 0;
	private boolean spots = false;
	private int weight = 0;
	
	public Animal(int numTeeth, boolean spots, int weight){
		this.setNumTeeth(numTeeth);
		this.setSpots(spots);
		this.setWeight(weight);
	}
	
	public int getNumTeeth(){
		return numTeeth;
	}

	public void setNumTeeth(int numTeeth) {
		this.numTeeth = numTeeth;
	}
	
	public boolean getSpots() {
		return spots;
	}

	public void setSpots(boolean spots) {
		this.spots = spots;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) 
   {
		this.weight = weight;
	}
}

class Cheetah extends Animal
{
   private static String cheetahType = "Male";
   
   public Cheetah(int numTeeth, boolean spots, int weight,String cheetahType)
   {
      super(numTeeth, spots, weight);
      this.cheetahType = cheetahType;    
   
   }
   
   
   public static void setCheetahnType(String cheetahType)
   {
    
      cheetahType = cheetahType;      
   }
     
   public static String getCheetahType()
   {
      return cheetahType;
   }
      
     
     public static void main(String[] args)
     {
        
         
         System.out.println(Cheetah.getCheetahType());
     }

   }
	

