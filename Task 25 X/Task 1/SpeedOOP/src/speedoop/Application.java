/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package speedoop;

/**
 *
 * @author Programming
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Car car1 = new Car("BMW", "RED", "i8", 150);
        
        Car car2 = new Car("VW", "Gray", "GTI", 250);
        
        Race race = new Race(1000, car1, car2);
        String raceResult = race.race();
        
        Car fromRace = race.getCar1();
        
        System.out.println(raceResult);
      
        
        
    }
    
}
