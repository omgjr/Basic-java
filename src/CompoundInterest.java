import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args)
	{
		System.out.println("Welcome to calculate compound interest");
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your principal amount: ");
		double p=input.nextDouble();
		System.out.println("Enter rate of interest: ");
		double r=input.nextDouble();
		System.out.println("Enter time of interest: ");
		double t=input.nextDouble();
		double CI=p*Math.pow((1+r/100),t);
		System.out.println("Your compond interest is: "+CI);
	}
    
}
