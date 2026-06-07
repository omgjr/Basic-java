import java.util.Scanner;

public class ReverseNum {
    	public static void main(String[] args)
	{
		System.out.println("Welcome to reverse the number");
		Scanner input=new Scanner(System.in);
		System.out.print("Please enter any number: ");
		int num=input.nextInt();
		int reverse=reverse(num);
		System.out.println("Reverse number is: "+reverse);
		
	}
	public static int reverse (int num) {
		int newNum=0;
		while(num>0) {
			int digit=num%10;
			num=num/10;
			newNum=newNum*10+digit;
		}
		return newNum;
		
		
		
	}

    
}
