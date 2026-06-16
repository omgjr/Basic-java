package in.kgcoding.multithreading;

public class SecondTask extends Thread {

    @Override
    public void run() {
         //second task complete
        for (int i = 1; i < 1000; i++) {
            System.out.printf("%d$ ",i);
            
        }
        System.out.println("\n $ task complete");
        
    }
    
    
}
