import java.util.Arrays;
import java.util.Scanner;

public class SecondMax {
     public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter how many numbers you enter: ");
        int num=input.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<arr.length;i++){
           System.out.println("Enter number: ");
            arr[i]=input.nextInt();
        }
               Arrays.sort(arr);
        System.out.println("Second largest number is: "+arr[arr.length-2]);
        
        }
    
}
