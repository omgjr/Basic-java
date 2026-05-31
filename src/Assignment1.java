public class Assignment1 {
    public static void main(String[] args) {
        int[] arr={3,5,8,14};
        int target=8;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.print(i+" ");
                }
            }
        }
    }
    
}
