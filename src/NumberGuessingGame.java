import java.util.Scanner;

class NumberGuessingGame {
    public static void main(String[] args){
        System.out.println("Welcome to guess number game");
        Scanner input=new Scanner(System.in);
        
        int num=5;
        do {
            System.out.print("Guess the number from 1 to 10: ");
            num=input.nextInt(); 
            
        } while (num != 5);
        System.out.println("You guased correct");
    }

    
}
