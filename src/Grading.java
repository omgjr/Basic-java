import java.util.Scanner;

public class Grading {
    public static void main(String[] args)
	{
		System.out.println("Welcome to calculate grading");
		Scanner input=new Scanner(System.in);
		System.out.print("Enter your percentage: ");
		float per=input.nextFloat();
		
		if(per>=90) {
			System.out.println("Your grade is A");
		}else if(per>=75) {
			System.out.println("Your grade is B");
		}
		else if(per>=50) {
			System.out.println("Your grade is C");
		}
		else if(per>=30) {
			System.out.println("Your grade is D");
		}else if(per>=20) {
			System.out.println("Your grade is F");
		}
	}
    
}
