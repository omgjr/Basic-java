package in.kgcoding.challenge104;


public class SleepTask implements Runnable {

    @Override
    public void run() {
       Thread current =Thread.currentThread();
       System.out.printf("Current Thread: %s", current.getName());
      try{
       Thread.sleep(getRandom()*1000);
      }catch(InterruptedException e){
        throw new RunException(e);
      }
      System.out.println("ended"+ current.getName());
    }

    private int getRandom(){
       double random= Math.random() * 5 + 1;
       return (int) random;
    }
    
    
}
