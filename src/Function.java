import java.util.Scanner;

public class Function {
    public static void main(String[] args)
	{
		greet();
		int first=readNumber();
		int second=readNumber();
		int sum=first+second;
		System.out.println("Sum of number is: "+sum);
		
	}
	public static int readNumber()
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Please enter number: ");
		int num=input.nextInt();
		return num;
	}
	public static void greet()
	{
		System.out.println("Welcome to calculater\n");
	}

    
}
