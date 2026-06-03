public class Car1 {
    
        int noOfWheels;
        int noOfDoors;
        int maxSpeed;
        String name;
        String modelNumber;
        String company;

        public Car1(int noOfWheels, int noOfDoors, int maxSpeed,String name,String modelNumber, String company){

            this.noOfWheels=noOfWheels;
            this.noOfDoors=noOfDoors;
            this.name=name;
            this.maxSpeed=maxSpeed;
            this.modelNumber=modelNumber;
            this.company=company;
        }
        public String toString(){
            return "My car name is: "+name;
        }
        public static void main(String[] args) {
         Car1 swift=new Car1(4,4,120,"swift","sw96","maruti");   
        
        System.out.println(swift.toString());
        }
    

    
    
}
