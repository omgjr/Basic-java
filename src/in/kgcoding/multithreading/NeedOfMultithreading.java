package in.kgcoding.multithreading;

public class NeedOfMultithreading {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        //first task complete
        for (int i = 1; i < 1000; i++) {
            System.out.printf("%d* ",i);
            
        }
        System.out.println("\n * task complete");


         //second task complete
        for (int i = 1; i < 1000; i++) {
            System.out.printf("%d$ ",i);
            
        }
        System.out.println("\n $ task complete");


         //third task complete
        for (int i = 1; i < 1000; i++) {
            System.out.printf("%d# ",i);
            
        }
        System.out.println("\n # task complete");
        long endTime=System.currentTimeMillis();
        System.out.printf("Total time taken: %d",(endTime-startTime));
    }
    
}
