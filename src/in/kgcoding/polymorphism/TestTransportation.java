package in.kgcoding.polymorphism;

public class TestTransportation {
    public static void main(String[] args) {
        Car c =new Car();
        //Vehicle v=new Vehicle();
        Plane p=new Plane();

       // c.start();
       // p.start();

       // castTest(v);
        castTest(c);
        castTest(p);


      //  Vehicle vCar=new Car();
      // Car cVehicle=(Car)new Vehicle();
      //Object ref=new Vehicle();

    }
    private static void castTest(Vehicle veh){
      

     // Car cVehicle =(Car)veh;
     veh.start();
      
    //  cVehicle.start();
    //  cVehicle.noOfDoors();
    }
    
}
