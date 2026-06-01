import java.util.Scanner;

public class ValidPassword {
    public static void main(String[] args) {
        System.out.println("Welcome to password checker");
        Scanner input=new Scanner(System.in);
        String password;
        do { 
            System.out.print("Please enter password: ");
            password=input.next();
        } while (!isValidPassword(password));
        System.out.println("Thanks for enter correct password");
    }
    public static boolean  isValidPassword(String password){
        return password.length()>6;
            
        }
    }
    

