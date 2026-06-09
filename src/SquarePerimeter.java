import java.util.Scanner;

public class SquarePerimeter {
    public static void main(String[] args)
	{
		System.out.println("Welcome to calculate perimeter of square");
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the side of square: ");
		int side=input.nextInt();
		int peri=side*4;
		System.out.println("Perimeter of square is: "+peri);
		
	}
    
}
