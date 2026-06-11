
import java.util.Scanner;
public class DiscountCollector {
    public static void main(String[] args)
	{
		System.out.println("Welcome to ticket discount collector");
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your age");
		int age=input.nextInt();
		System.out.println("Are you female? (true/false)");
		boolean isFemale=input.nextBoolean();
	

	if(age<5) {
		System.out.println("You got 75% discount");
		}else if(isFemale) {
			System.out.println("You got 50% discount");
		
		else if(age>60 !isFemale) {
			System.out.println("You got 25% discount");
		}
		else {
			System.out.println("You got no discount");
		}
		
    
    }

