public class Assignment9 {
    public static void main(String[] args) {
     String[] arr={"Java","Programming","Code","Developer"};
     String largest=arr[0];
     for(int i=1;i<arr.length;i++){
        if(arr[i].length()>largest.length()){
            largest=arr[i];
        }
     } 
     System.out.println("Largest string is: "+largest); 
    }
    
}
