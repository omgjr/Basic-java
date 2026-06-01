public class PrintEven {
    public static void main(String[] args){
        System.out.println("Welcome to print even numbers");
        for(int i=1;i<100;i++){
            if(i%2==1){
                continue;
            }
            System.out.println(i);
        }
    }
    
}
