 import java.util.Scanner;
 class GuessingGame {
    
     int random;
     GuessingGame(){
        random=(int)Math.ceil(Math.random()*100);
     }
     int guess(int guessNumber){
        return guessNumber-random;
     }
     public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      GuessingGame obj=new GuessingGame();
      System.out.println("Welcome to the guessing number between 1 to 100"); 
      int guess;
      int result;
      do { 
          System.out.print("Guess the number:");
          guess=input.nextInt();
          result=obj.guess(guess);
          if(result==0){
            System.out.println("Congrrats your guess is correct");
          }else if(result<0){
            System.out.println("You guess higher");
          }else{
            System.out.println("You guess lower");
          }
      } while (result !=0);  
     } 

    }
    

