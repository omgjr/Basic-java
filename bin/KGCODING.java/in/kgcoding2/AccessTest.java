public class AccessTest {
    public static void main(String[] args) {
        AccessModifier car=new AccessModifier();
        car.color="Red";
        car.model="Swift";
        System.out.println(car);
        //car.purchaseCost=7654;
        AccessModifier newCar=new AccessModifier("Black","BMW",1,5000);
        System.out.println(newCar); 
      //  Default def=new Default();
    }
    
    
}
