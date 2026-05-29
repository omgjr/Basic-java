import java.util.Scanner;

public class OddEvenTernary {
    public static void main(String[] args) {
        System.out.println("Welcome to check odd even number");
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your number");
        int num=input.nextInt();
       String oddEven= num%2==0 ? "Even":"Odd";
       System.out.println("Your number is: "+oddEven);
    }
}
    

