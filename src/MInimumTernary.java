import java.util.Scanner;

public class MInimumTernary {
    public static void main(String[] args){
        System.out.println("Welcome to minimum number check");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1=input.nextInt();
        System.out.print("Enter second number: ");
        int num2=input.nextInt();
        MInimumTernary ternary=new MInimumTernary();
         int min=ternary.min(num1,num2);
        System.out.println(" minimum number is: "+ min);

    }
    public int min(int num1,int num2){
       return num1<num2 ? num1:num2;
    }
    
}
