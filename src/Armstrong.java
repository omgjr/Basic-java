import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args)
	{
		System.out.println("Welcome to check armstrong number");
		Scanner input=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=input.nextInt();
		boolean isArmstrong=isArmstrong(num);
		if(isArmstrong) {
			System.out.println("Number is armstrong");
		}else {
			System.out.println("Number is not armstrong");
		}
	}
	public static boolean isArmstrong(int num) {
		int originalNumber=num;
		int finalNumber=0;
		while(num>0) {
			int lastNumber=num%10;
			num/=10;
			finalNumber+=lastNumber*lastNumber*lastNumber;
		}
		return finalNumber==originalNumber;
	}
    
}
