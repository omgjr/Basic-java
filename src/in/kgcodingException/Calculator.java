package in.kgcodingException;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
      a();
       
    }
    

    private static void a(){
      b();
    }
        private static void b(){
      c();
    }
        private static void c(){
      d();

    }
        private static void d(){
           Scanner input=new Scanner(System.in);
        System.out.println("Welcome to division calculator");
        System.out.print("Please enter two numbers: ");
        int first=input.nextInt();
        int second=input.nextInt();

       try{
        int[] arr=new int[4];
        System.out.println(arr[6]);
        arr[6] =first/second;
        System.out.printf("Result is %d",arr[6]);
       }catch(ArithmeticException exception){
        
        System.out.println("Divide by zero, Enter valid values");
       System.out.printf("%s,enter valid values",exception.getMessage());
       }//catch(ArrayIndexOutOfBoundsException exc){
      //  System.out.println("Array is out of bound");
      // }
      catch(Throwable th){
        System.out.println("General exception.");
        throw th;
      }
      
    }
    
}
