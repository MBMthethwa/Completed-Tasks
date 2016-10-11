public class Human
{
   private String fistnames;
   private String surname;
   private String gender;
   private int age;
   
   public void Human()
   {
      
   }
   
   public void Human(String fistnames,String surname, String gender,int age )
   {
      this.fistnames = fistnames;
      this.surname = surname;
      this.gender = gender;
      this.age = age;
   }
   
   public void setFistnames(String fistnames)
   {
      this.fistnames = fistnames;
   }
   
   public void setSurname(String surname)
   {
      this.surname = surname;
   }
   
   public void setGender(String gender)
   {
      this.gender = gender;
   }
   
   public void setAge(int age)
   {
      this.age = age;
   }

   
   
   public String getFistnames()
   {
      return fistnames;
   }
   
   public String getSurname()
   {
      return surname;
   }
   
   public String getGender()
   {
      return gender;
   }
   
   public int getAge()
   {
      return this.age;
   }

   
   
   public static void main(String[] args)
   {
      
      Human john = new Human();
      john.setFistnames("John");
      john.setSurname("Smith");
      john.setGender("Male");
      john.setAge(24);
      
      Human thabang = new Human();
      thabang.setFistnames("Thabang");
      thabang.setSurname("Mthethwa");
      thabang.setGender("Male");
      thabang.setAge(27);

      
     

      String thabangPersonDetails = thabang.getFistnames() + " " + thabang.getSurname()+ " "  + thabang.getGender() + " " + thabang.getAge();
      String johnPersonDetails = john.getFistnames() + " " + john.getSurname()+ " "  + john.getGender() + " " + john.getAge();

      System.out.println(thabangPersonDetails);
      System.out.println(johnPersonDetails);
   }
}