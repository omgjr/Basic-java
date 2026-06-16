package in.kgcoding.multithreading.synchronize;



public class TestingSynchronize {
    Counter counter=new Counter();
    UpdaterThread t1=new UpdaterThread(counter);
    UpdaterThread t2=new UpdaterThread(counter);

    t1.start();
    t2.start();
    
}
