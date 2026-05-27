import java.util.Scanner;

public class Switch {
    public static void main(String[] args)
    {
        System.out.println("Welcome to switch case");
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your day in number");
        int day=input.nextInt();
        newSwitch(day);
    }

       public static void newSwitch(int day){
        String dayStr= switch(day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid";
            
        };
        System.out.println(dayStr);
    

    }
    
}
