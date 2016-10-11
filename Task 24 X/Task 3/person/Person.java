/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

import javax.swing.JOptionPane;

/**
 *
 * @author Programming
 */
public class Person {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         
        OOP oop = new OOP("Mbali", "Mthethwa", "Female",24, "Student",1.56);
        oop.setFistnames("Mbali");
        oop.setSurname("Mthethwa");
        oop.setGender("Female");
        oop.setAge(24);
        oop.setHeight(1.56);
        oop.setOccupation("Student");
        JOptionPane.showMessageDialog(null,oop.getFistnames() + " " + oop.getSurname() + " " + oop.getGender() + " " + oop.getAge() + " " + oop.getOccupation() + " " + oop.getHeight()  );
        
    }
    
}
