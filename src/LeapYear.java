import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args)
	{
		System.out.println("Welcome to check leap year");
		Scanner input=new Scanner(System.in);
		System.out.print("Please enter the year: ");
		int year=input.nextInt();
		
		if(year%400==0 || (year%4==0 && year%100 !=0)) {
			System.out.println("Year is leap year: ");
		}else {
			System.out.print("Year is not a leap year");
		}
		
	}
    
}
