import java.util.Scanner;

public class Eligibility {
    public static void main(String[] args)
	{
		System.out.println("Welcome to eligibility criteria in driving licence");
		Scanner input=new Scanner(System.in);
		System.out.print("Please enter your age: ");
		int age=input.nextInt();
		
		if(age>=18) {
			System.out.println("You are eligible for drive");
		}else {
			System.out.println("Aap cycle chalao");
		}
	}

    
}
