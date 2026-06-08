package in.kgcoding.nested;

public class Car {
    private int noOfDoors;
   public void repair(){
    tire t=new tire();
   }
    public  class tire{
        private double width;
        private double pressure;
        private String material;

        public void inflate(){
            noOfDoors=4;
        }
        
        public void start(){
            System.out.println("Car is starting");
        }
    }
    
}
