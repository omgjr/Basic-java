import java.util.Scanner;

public class Array4 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int[] arr=new int[4];
        for(int i=0;i<arr.length;i++){
             arr[i]=input.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}
