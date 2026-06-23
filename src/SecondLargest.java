import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<arr.length;i++){
           
            arr[i]=input.nextInt();
        }
               Arrays.sort(arr);
        System.out.println("Second largest number is: "+arr[arr.length-2]);
        
        }
    }
    
    

