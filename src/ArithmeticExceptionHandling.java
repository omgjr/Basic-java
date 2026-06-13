import java.util.Scanner;
public class ArithmeticExceptionHandling {
    public static void main(String[] args) {
        System.out.println("Welcome to exception handling program");
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int first=input.nextInt();
        System.out.print("Please enter another number: ");
        int second=input.nextInt();
       // int result=first/second;

        try {
           int result=first/second;
            System.out.print("Result is: "+result);
        } catch (ArithmeticException e) {
          if(e.getMessage().equals("/ by zero")){
            System.out.println("Divide by zero occured");
          } else{
            throw e;
          }
        }
        


    }
    
}
