import java.util.Scanner;

public class StudentScoreTernary {
    public static void main(String[] args){
  //  System.out.println("Welcome to student score ");
    Scanner input=new Scanner(System.in);
    System.out.print("Enter student marks: ");
    int marks=input.nextInt();
    
  String category=  marks>80 ? "High":(marks>50 ? "Moderate":"Low");
    System.out.println("Your category is: "+category);
}
    
}
