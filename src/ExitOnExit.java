import java.util.Scanner;

public class ExitOnExit {
    public static void main(String[] args){
        Scanner input=new Scanner (System.in);
        while(true){
            System.out.print("Enter your commamd: ");
            String command=input.next();
            if(command.equalsIgnoreCase("exit")){
                break;
                           }
        }
        System.out.println("You hava successfully exited");

    }
    
}
