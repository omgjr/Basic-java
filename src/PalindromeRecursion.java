import java.util.Scanner;
//import java.lang.*;
public class PalindromeRecursion {
    public static void main(String[] args) {
     System.out.println("Welcome to find string is palindrome");
     Scanner input=new Scanner(System.in);
     System.out.println("Enter the string for check palindrome");
     String str=input.next();
     System.out.print("Your string is: "+isPalindrome(str) ? "Palindrome" : "Not palindrome");   
    }
    public static boolean  isPalindrome(String str){
        if(str.length()<=1){
            return true;
        }
        int lastPos=str.length()-1;
        if(str.charAt(0)=str.charAt(lastPos)){
            return false;
        }
        String newStr=str.substring(1,lastPos);
        return isPalindrome(newStr);
      
    }
    
}
