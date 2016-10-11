/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Programming
 */
public class Race {
    private int trackLength;
    private Car car1;
    private Car car2;

    public Race(int trackLength, Car car1, Car car2) {
        this.trackLength = trackLength;
        this.car1 = car1;
        this.car2 = car2;
    }

    public int getTrackLength() {
        return trackLength;
    }

    public void setTrackLength(int trackLength) {
        this.trackLength = trackLength;
    }

    public Car getCar1() {
        return car1;
    }

    public void setCar1(Car car1) {
        this.car1 = car1;
    }

    public Car getCar2() {
        return car2;
    }

    public void setCar2(Car car2) {
        this.car2 = car2;
    }
    
    
    
    public String race()
    {
        int topSpeedOfCar1 = car1.getTopSpeed();
        int topSpeedOfCar2 = car2.getTopSpeed();
        
       
        
        String result = "";
       
        if(topSpeedOfCar1 == topSpeedOfCar2)
        {
            result = "This race was a tie!";
        }
        else if(topSpeedOfCar1 > topSpeedOfCar2)
        {
            double distanceInKM = this.trackLength / 1000;
            double timeInHours = (distanceInKM / topSpeedOfCar1) ;
            double timeInMInutes = timeInHours * 60; 
            double timeInSeconds =  timeInMInutes * 60 ;
            result = car1.getBrand() + " " + car1.getModel() + " won the race covering a distance of " + trackLength + " m in " + timeInSeconds  + " seconds";
        }
        else if(topSpeedOfCar1 < topSpeedOfCar2)
        {
            double distanceInKM = this.trackLength / 1000;
            double timeInHours = (distanceInKM / topSpeedOfCar2) ;
            double timeInMInutes = timeInHours * 60; 
            double timeInSeconds =  timeInMInutes * 60 ;
            result = car2.getBrand() + " " + car2.getModel() + " won the race covering a distance of " + trackLength + " m in " +  timeInSeconds + " seconds";
        }
        
        
                
        return result;
    }
}
