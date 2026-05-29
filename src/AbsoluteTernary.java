import java.util.Scanner;

public class AbsoluteTernary {
    public static void main(String[] args) {
        System.out.println("Welcome to absolute value");
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int num=input.nextInt();
        int result=num >= 0 ? num:-num;
        System.out.println("absolute value of number is: "+result);
    }
    
}
