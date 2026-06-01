public class SumPositive {
    public static void main(String[] args) {
     System.out.println("Welcome to calculate sum of positive numbers");
     int[] arr={1,2,-3,-7,1,4,20};
     int sum=0;
     for(int num:arr){
        if(num<0){
            continue;
            

        }
        sum=sum+num;
                    
     } 
     System.out.println("Sum of positive number is: "+sum);
                 
    }
    
}
