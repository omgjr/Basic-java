public class MaxArray {
    public static void main(String[] args) {
     System.out.println("Welcome to finding maximum value of an array");
    // Scanner input=new Scanner (System.in);
     int[] arr={10,20,30,40,50,60,70,8,80,90,108};
     int max=Integer.MIN_VALUE;
     
        for(int num:arr){
            if(max<num){
                max=num;
            }
        }
        System.out.println("Maximum number is"+max);
     }

    }
    

