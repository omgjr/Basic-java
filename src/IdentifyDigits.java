import java.util.Scanner;

public class IdentifyDigits {
    public static void main(String[] args)
	{
		System.out.println("Welcome to number checker");
		Scanner input=new Scanner(System.in);
		System.out.print("Please enter any number: ");
		int num=input.nextInt();
		
		if(num>0) {
			System.out.println(" your number is positive");
		}else if(num==0) {
			System.out.println("Your number is zero");
		}else {
			System.out.println("Your number is negative");
		}
	}

    
}
