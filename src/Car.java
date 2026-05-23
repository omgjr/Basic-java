public class Car {
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;

    public static void drive() {
        System.out.println("car is driving");
        currentFuelInLiteres--;
    }

    public static void addFuel(float fuel){
        currentFuelInLiteres+=fuel;
        
    }
    public float getCurrentFuelLevel(){
        return currentFuelInLiters;
    }
    
}
