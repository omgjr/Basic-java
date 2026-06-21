public class ArrayMax {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70,80};
        int max=0;//arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
            
            
        }
        System.out.println("Maximum number is"+max);
    }
    
}
