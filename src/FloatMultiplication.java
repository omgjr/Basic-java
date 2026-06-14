import java.util.Scanner;

public class FloatMultiplication {
    public static void main(String[] args)
	{
		System.out.println("welcome to float multiplication");
		Scanner input=new Scanner(System.in);
		System.out.print("Enter first floating value: ");
		double first=input.nextDouble();
		System.out.print("Enter second floating value: ");
		double second=input.nextDouble();
		double mul=first*second;
		System.out.println("Multiplication of floating value is: "+mul);
		
	}
    
}
