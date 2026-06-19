package in.kgcoding;

public class ArrayUpdation {
    public static void main(String[] args) {
        int[] arr={20,30,40};
        int[] newArr=new int[arr.length+1];
        newArr[0]=100;

        for (int i = 0; i < arr.length; i++) {
          newArr[i+1]=arr[i];
            
        }
        for(int x:newArr){
            System.out.print(x+" ");
        }
    }
    
}
