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
public class OOP extends Human{
    private double height; 
    
   public void OOP()
   {
     
    
   }
    
    public OOP(String fistnames, String surname, String gender, int age, String occupation, double height) {
        super(fistnames, surname, gender, age, occupation);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
   
    
    
   

   
    
    
    
  
    
    
}
