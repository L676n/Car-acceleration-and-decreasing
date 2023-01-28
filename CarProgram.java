
package assignment6;

public class CarProgram {

    public static void main(String[] args) {
        
        Car car1 = new Car(2020, " Honda");
        
        System.out.println("The car acceleration is");
        for( int time = 0; time <= 5; ++ time){
            car1.accelerate();
            System.out.println("The current speed of " + car1.getYearModel()
                    + car1.getMake() + "is " + car1.getSpeed() + " km/h");
        }
        
        System.out.println("\n\nThe car brake is");
        for( int time = 0; time <= 5; ++ time){
            car1.brake();
            System.out.println("The current speed of " + car1.getYearModel()
                    + car1.getMake() + "is " + car1.getSpeed() + " km/h");
        }
    }
    
}
