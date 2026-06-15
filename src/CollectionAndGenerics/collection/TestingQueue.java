package CollectionAndGenerics.collection;
import java.util.LinkedList;
import java.util.Queue;
public class TestingQueue {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.offer(3);

        Utility.print(queue );
       

        System.out.println(queue.peek());
        System.out.println(queue.element());
        System.out.println(queue.remove());

        Utility.print(queue);
        System.out.println(queue.poll());
         System.out.println(queue.poll());
      //   System.out.println(queue.remove());
         System.out.println(queue.poll());

        
    }
    
}
