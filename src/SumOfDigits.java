import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args)
	{
		System.out.println("Welcome to calculate sum of digits: ");
		Scanner input=new Scanner(System.in);
		System.out.print("Please any num which is more than one digit: ");
		int num=input.nextInt();
		int sum=sumDigit(num);
		System.out.println("sum of digits is: "+sum);
	}
	public static int sumDigit(int num)
	{
		int sum=0;
		while(num>0) {
			sum+=num%10;
			num=num/10;
		}
		return sum;
	}
    
}
