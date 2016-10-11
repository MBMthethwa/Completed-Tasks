/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author Programming
 */
public class Human {
    private String fistnames;
   private String surname;
   private String gender;
   private int age;
   private String occupation;

    Human(String fistnames, String surname, String gender, int age, String occupation) {
        
    }
   
   public void Human()
   {
       this.fistnames = "";
      this.surname = "";
      this.gender = "";
      this.age = 0;
      this.occupation = "";
   
   }

   
   public void Human(String fistnames,String surname, String gender,int age,String occupation )
   {
      this.fistnames = fistnames;
      this.surname = surname;
      this.gender = gender;
      this.age = age;
      this.occupation = occupation;
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
   
   public void setOccupation(String occupation)
   {
      this.occupation = occupation;
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
   
   public String getOccupation()
   {
      return this.occupation ;
   }
   

    
}
