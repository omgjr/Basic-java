
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to reverse numbers according to user: ");
        Scanner input=new Scanner(System.in);
        System.out.print("Choose how many numbers you enter: ");
        int num=input.nextInt();

        int[] arr=new int[num];
        for (int i = 0; i < arr.length; i++) {
             arr[i]=input.nextInt();
        }
            for (int i = arr.length-1; i >= 0; i--) {
                System.out.print(arr[i]+" ");
            
            
        }


    }
    
}
