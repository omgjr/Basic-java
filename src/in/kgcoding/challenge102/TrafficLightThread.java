package in.kgcoding.challenge102;

public class TrafficLightThread extends Thread{
    private final TrafficColor color;

    public TrafficLightThread(TrafficColor color){
        this.color=color;
    }

    @Override
    public void run() {
       System.out.println("active"+color);
       try{
       Thread.sleep(color.getOnTimeInMillis());
       }catch(InterruptedException e){
        throw new RuntimeException(e);
       }
       System.out.println("Inactive"+color);
    }
    
    
    
}
