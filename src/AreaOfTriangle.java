import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args)
	{
		System.out.println("Welcome to calculate area of triangle");
		Scanner input=new Scanner(System.in);
		System.out.print("Please enter base of triangle in cms: ");
		double base=input.nextDouble();
		System.out.print("Know enter the perpendicular in cms: ");
		double length=input.nextDouble();
		double area=0.5*base*length;
		System.out.println("Area of triangle is: "+area);
	}

    
}
