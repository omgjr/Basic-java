import java.util.Scanner;

public class MultiplicationTableFor {
    public static void main(String[] args) {
        System.out.println("Welcome to multiplication table form");
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter your number for table formation: ");
        int num=input.nextInt();
        for(int i=1;i<11;i++){
            System.out.println(num+"x"+i+"="+num*i);
        }
    }
    
}
