
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

class Lion extends Animal
{
   private String lionType;
   
   public Lion(int numTeeth, boolean spots, int weight,String lionType)
   {
      super(numTeeth, spots, weight);
      setLionType(lionType);
      
   
   }
   
   public void setLionType(String lionType)
   {
     
      
      Animal animal = new Animal(getNumTeeth(),getSpots(),getWeight());
      
      if(animal.getWeight() < 80)
      {
         lionType = "cub";
          this.lionType = lionType;

      }
      else
      {
         lionType = "Female";
         this.lionType = lionType;
      }
      
  }
     
   public String getLionType()
   {
      return this.lionType;
   }
      
     
     public static void main(String[] args)
     {
        Lion lion = new Lion(0,false,90,"");
         
         System.out.println(lion.getLionType());
     }

   }
	

