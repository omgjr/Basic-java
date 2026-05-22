import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args)
	{
		System.out.println("Welcome to calculate simple interest");
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your principal amount: ");
		double principal=input.nextDouble();
		System.out.println("Enter rate of interest: ");
		double rate=input.nextDouble();
		System.out.println("Enter time of interest: ");
		double time=input.nextDouble();
		double SI=(principal*rate*time)/100;
		System.out.println("Your simple interest is: "+SI);
	}

    
}
