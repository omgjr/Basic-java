package CollectionAndGenerics.collection;
import java.util.*;

public class Utility {
    public static <E> void print(Collection<E> collection){
        System.out.println("collection is: ");
        for(E coll:collection){
            System.out.print(" "+coll);
        }
        System.out.println();
    }
    
}
