import java.util.Scanner;

public class OddEven {
    public static void main(String[] args)
	{
		System.out.println("Welcome to check number odd or even");
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter any number");
		int num=input.nextInt();
		
		
		if(num%2==0) {
			System.out.println("Your number is even");
			
		}else {
			System.out.println("Your number is odd");
			
		}
		
	}
    
}
