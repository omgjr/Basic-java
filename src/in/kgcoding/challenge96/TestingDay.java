package in.kgcoding.challenge96;

public class TestingDay {
    public static void main(String[] args) {
      /*  System.out.println("printing all the days of week");
        System.out.println(Day.Monday);
        System.out.println(Day.Tuesday);
        System.out.println(Day.Wednesday);
        System.out.println(Day.Thursday);
        System.out.println(Day.Friday);
        System.out.println(Day.Saturday);
        System.out.println(Day.Sunday); */


       for (Day day : Day.values()) {
        System.out.println(day);
        
       }
    }
    
}
