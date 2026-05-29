public class Array6 {
    public static void main(String[] args){
    
        int[] arr={10,20,30,40,50,60,70,80,90};
        int oddIdxSum=0;
        for(int i=0;i<arr.length;i++){
        
         oddIdxSum += arr[i];
         i++;
        
        }
       System.out.println( oddIdxSum);

    }
    
}
