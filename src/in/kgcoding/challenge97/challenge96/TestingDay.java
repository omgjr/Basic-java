package in.kgcoding.challenge96;

public class TestingDay {
    public static void main(String[] args) {
       System.out.println("printing all the days of week");
        for(Day day:Day.values()){
          System.out.printf("%s: %s\n", day, day.getType());
        }
    }
    
}
