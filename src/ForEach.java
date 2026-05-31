

public class ForEach {
    public static void main(String[] args) {
     String[] array=new String[]{"Rohan","Raju","Ravi","Mohan","Motu"}; 
     printArrayForEacb(array);
    // printArray(array);
    }
    public static void printArrayForEacb(String[] array){
        for(String name:array){
            System.out.println(name);
        }
    }
    public static void printArray(String[] array){
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    
}
