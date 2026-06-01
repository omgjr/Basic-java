import java.util.Scanner;

public class PrimeFor {
    public static void main(String[] args) {
     System.out.println("Welcome to checker for prime number");
     Scanner input=new Scanner(System.in);
     System.out.print("Enter any number: ");
     int num=input.nextInt();
     boolean isPrime=isPrime(num);
     System.out.println(isPrime ? "Prime":"not prime");   
    }
    public static boolean isPrime(int num){
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    
}
