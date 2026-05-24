import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args)
	{
		System.out.println("Welcome to check palindrome number");
		Scanner input=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=input.nextInt();
		boolean isPalindrome=isPalindrome(num);
		if(isPalindrome) {
			System.out.println("Number is palindrome");
		}else {
			System.out.println("Number is not palindrome");
		}
	}
	public static boolean isPalindrome(int num)
	{
		int originalNum=num;
		int reverseNum=0;
		while(num>0) {
			int lastNum=num%10;
		    reverseNum=reverseNum*10+lastNum;
			num=num/10;
			
		}
		return originalNum==reverseNum;
	}
    
}
