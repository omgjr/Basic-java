import java.util.Scanner;

public class FabSeries {
    public static void main(String[] args)
	{
		System.out.println("Welcome to calculate fabonacci series");
		Scanner input=new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num=input.nextInt();
		int fabonacci=fabonacci(num);
		System.out.println("fabonacci series is:"+fabonacci);
	}
	public static int fabonacci(int num) {
		if(num<0) {
			return 0;
		}
		if(num==0) {
			return 1;
		}
		int first=0;
		int second=1;
		while(first+second<=num) {
		int	third=first+second;
		System.out.println(third+"");
		 first=second;
		second=third;
		
		}
		return second;
	}
    
}
